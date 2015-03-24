package org.finance;

public interface UserStore {
    void insert(User user);
    User select(String email, String password) throws Exception;
    boolean select(String email);
    void deleteAll();
}

