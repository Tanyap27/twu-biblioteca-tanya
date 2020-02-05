package com.twu.biblioteca;

import com.twu.biblioteca.contents.bookList;
import com.twu.biblioteca.MenuOptions;

import java.util.List;
import java.util.Arrays;

public class BibliotecaApp {

   //greet the user
    public static String greetings() {
        return ( "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
    }

    //get the list of books
    public static List getTheBooksList() {
        List<bookList> listOfTheBooks = Arrays.asList(
                new bookList("The Da Vince Code", "Dan Brown", 2000),
                new bookList("Harry Potter", "J.K. Rowling", 2001),
                new bookList("Shiva", "Amit Trivedi", 2002),
                new bookList("Mythos", "Stephen Fry", 2003)
        );

        System.out.println(listOfTheBooks);
        return listOfTheBooks;

    }

    public static void main(String[] args) {
        // show the welcome message!
        System.out.println(greetings());

        //get the list of books
        getTheBooksList();

        //display the menu with options
        MenuOptions.theMenu();

    }
}