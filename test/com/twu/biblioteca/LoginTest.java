package com.twu.biblioteca;
import com.twu.biblioteca.contents.Users;
import org.junit.Before;
import org.junit.Test;
import com.twu.biblioteca.Login;
import static org.junit.Assert.assertEquals;


public class LoginTest {

    private Login login;
    private Users firstUser = new Users("000-0001", "pass1");
    private Users[] users = new Users[]{firstUser};

    @Before
    public void beforeEveryTest() {
        login = new Login(users);
    }

    @Test
    public void shouldReturnTheUserCredentials() {
        System.out.println(firstUser);
        login.loggingIn("000-0001", "pass1");
        assertEquals(firstUser, login.getTheLoggedInUser());
    }
}
