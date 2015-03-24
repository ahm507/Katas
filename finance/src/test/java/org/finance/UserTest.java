package org.finance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
    @Before
    public void setUp() throws Exception {
        new UserStoreMemory().deleteAll();
    }

    @Test
    public void registerUser() throws Exception {
        User user = User.register("test@test.test", "secret", "secret", "Ahmed hammad");
        assertEquals("test@test.test", user.getEmail());
    }

    @Test (expected=Exception.class)
    public void registerUserWithInvalidPassword() throws Exception {
        User.register("test@test.test", "", "", "Ahmed hammad");
        User.register("test@test.test", "secret", "secret2", "Ahmed hammad");
    }

    @Test (expected=Exception.class)
    public void registerUserWithMismatchedPassword() throws Exception {
        User.register("test@test.test", "secret", "secret2", "Ahmed hammad");
    }

    @Test  (expected=Exception.class)
    public void registerInvalidEmail() throws Exception {
        User.register("test@", "secret", "secret", "Ahmed");
    }

    @Test (expected=Exception.class)
    public void registerDuplicateUser()  throws Exception {
        User.register("test@test.test", "secret", "secret", "Ahmed");
        User.register("test@test.test", "secret", "secret", "Ahmed");
    }

    @Test (expected=Exception.class)
    public void registerFailedLogin()  throws Exception {
        User.login("test@test.test", "secret");
    }

    @Test
    public void loginSuccessfully()  throws Exception {
        User.register("test@test.test", "secret", "secret", "Ahmed");
        User user = User.login("test@test.test", "secret");
        assertEquals("Ahmed", user.getName());
    }

}