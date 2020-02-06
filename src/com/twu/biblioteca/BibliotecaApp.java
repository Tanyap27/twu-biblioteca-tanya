package com.twu.biblioteca;

import com.twu.biblioteca.contents.bookList;
import com.twu.biblioteca.MenuOptions;
import com.twu.biblioteca.Items;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BibliotecaApp {

   //greet the user
    static String greetings() {
        return ( "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
    }

    //get the options
    private static MenuOptions menuOptions = new MenuOptions(
            "Choose Option:\n" +
                    "1. - To open the book menu, please select 1\n" +
                    "2. - To checkout, select 2\n" +
                    "3. - To return, select 3\n" +
                    "4. - To quit, please select 4\n"
    );

    /*public static void getMenu() {
        System.out.println(menuOptions);
    }

    public static List getTheBooksList() {
        for( bookList bookList: listOfTheBooks) {
            System.out.println(bookList);
        }
        return listOfTheBooks;
    }*/

     static void getTheBooksList() {

        //get the list of books from bookList
        Items item = new Items (
                new bookList("The Da Vince Code", "Dan Brown", 2000, 12),
                new bookList("Harry Potter", "J.K. Rowling", 2001, 13),
                new bookList("Shiva", "Amit Trivedi", 2002, 14),
                new bookList("Mythos", "Stephen Fry", 2003, 15)
        );

        item.getTheListOfBooks();
    }

    public static void main(String[] args) {
        // show the welcome message!
        System.out.println(greetings());

        //get the list of books
        getTheBooksList();

        //display the menu with options
       // MenuOptions.menuOptions();
       // MenuOptions.theMenu();


    }
}