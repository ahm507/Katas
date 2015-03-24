package org.finance;

public class User {

    private String email;
    private String password;
    private String name;
    static private UserStore repository = new UserStoreMemory();

    public User(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public static User register(String email, String password, String password2, String name) throws Exception {
        email = email.toLowerCase();
        if(password.isEmpty()) {
            throw new Exception("EmptyPassword");
        }
        if(password.equals(password2) == false) {
            throw new Exception("MismatchedPassword");
        }
        if(validEmailSyntax(email) == false) {
            throw new Exception("InvalidEmail");
        }
        if(isUserExist(email) == true) {
            throw new Exception("EmailAlreadyExist");
        }
        User user = new User(email, password, name);
        repository.insert(user);
        return user;
    }

    public static User login(String email, String password) throws Exception {
        email = email.toLowerCase();
        if(validEmailSyntax(email) == false) {
            throw new Exception("InvalidEMail");
        }

        return repository.select(email, password);
    }

    private static boolean validEmailSyntax(String email) {
        if (email == null || email.length() == 0 || email.indexOf('@') == -1 || email.indexOf('.') == -1) {
            return false;
        }
        if (email.length() < 5) {// minimum a@b.c
            return false;
        }
        if (email.indexOf('\'') != -1 || email.indexOf('\"') != -1
                || email.indexOf('\\') != -1 || email.indexOf('/') != -1
                || email.indexOf(' ') != -1 || email.indexOf(',') != -1
                || email.indexOf(';') != -1 || email.indexOf(',') != -1) {
            return false;
        }
        return true;
    }

    private static boolean isUserExist(String email) {
        email = email.toLowerCase();
        return repository.select(email);
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

}
