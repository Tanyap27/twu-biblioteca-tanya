package com.twu.biblioteca;
import java.util.ArrayList;
import java.util.HashMap;
import com.twu.biblioteca.contents.Users;

public class Login {

    private HashMap<String, Users> mapUserList = new HashMap<String, Users>();
    private Users theLoggedInUser;

    public Login(Users... users) {
        for (Users user: users){
            mapUserList.put(user.getLibraryNumber(), user);
        }
        theLoggedInUser = null;
    }

    public Users getTheLoggedInUser() {

        return theLoggedInUser;
    }

    public void loggingIn(String libraryNumber, String password) {
    }

}
