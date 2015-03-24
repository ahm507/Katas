package org.finance;

import java.util.ArrayList;

public class UserStoreMemory implements UserStore {

    private static ArrayList<User> users = new ArrayList<User>();

    @Override
    public void insert(User user) {
        users.add(user);
    }

    @Override
    public User select(String email, String password) throws Exception {
        for(User user : users) {
            if(email.equals(user.getEmail()) && password.equals(user.getPassword())) {
                return user;
            }
        }
        throw new Exception("EmailNotExist");
    }

    @Override
    public boolean select(String email) {
        for(User user : UserStoreMemory.users) {
            if(email.equals(user.getEmail())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void deleteAll() {
        users.removeAll(users);
    }
}
