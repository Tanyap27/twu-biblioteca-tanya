package com.twu.biblioteca;

import com.twu.biblioteca.contents.bookList;
import java.util.*;

public class MenuOptions {

    public static void question() {

        //different options present
        System.out.println("To open the book menu, please select 1");
        System.out.println("To quit, please select 2 ");

        //to read the option
        Scanner read = new Scanner(System.in);

        String selectedOption = read.next();

        selectOptions(selectedOption);
        }

    public static void selectOptions(String option) {

        //different menu options present
        String result = "";
        switch (option) {
            case "1":
                System.out.println(getTheBooksList());
                break;

            case "2":
                System.out.println ( "Exiting the application" );
                System.exit(1);
                break;

            default:
                System.err.println ( "Invalid option" );
                break;
            }
    }
    public static List getTheBooksList() {

        //get the list of books from bookList
        List<bookList> listOfTheBooks = Arrays.asList(
                new bookList("The Da Vince Code", "Dan Brown", 2000),
                new bookList("Harry Potter", "J.K. Rowling", 2001),
                new bookList("Shiva", "Amit Trivedi", 2002),
                new bookList("Mythos", "Stephen Fry", 2003)
        );

        return listOfTheBooks;
    }

    public static void theMenu() {
        question();
    }

}
