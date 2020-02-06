package com.twu.biblioteca;

import com.twu.biblioteca.contents.bookList;
import java.util.*;
import java.util.stream.Collectors;

public class MenuOptions {

    //different options present
    private static String menuOptions = "Choose Option:\n" +
            "To open the book menu, please select 1\n" +
            "To checkout, select 2\n" +
            "To quit, please select 3\n" + "" ;

    private static int readConsoleInput(String message) {

        //to read the option
        Scanner read = new Scanner(System.in);
        System.out.println(message);

        return read.nextInt() ;
        }


    public static List getTheBooksList() {

        //get the list of books from bookList
        List<bookList> listOfTheBooks = Arrays.asList(
                new bookList("The Da Vince Code", "Dan Brown", 2000, 12),
                new bookList("Harry Potter", "J.K. Rowling", 2001, 13),
                new bookList("Shiva", "Amit Trivedi", 2002, 14),
                new bookList("Mythos", "Stephen Fry", 2003, 15)
        );

        //return listOfTheBooks;
        return listOfTheBooks.stream().filter(bookList -> bookList.getAvailablity() == false).collect(Collectors.toList());
    }

    public static void bookToBeCheckedOut() {

        List<bookList> listOfTheBooks = getTheBooksList();
        String message = "Select the id of the book to be checked out\n" + listOfTheBooks.toString();

        int option = readConsoleInput(message);

        for(int i = 0; i < listOfTheBooks.size(); i ++){
            bookList bookList = listOfTheBooks.get(i);

            if(bookList.getId() == option && !bookList.getAvailablity()) {
                bookList.setAvailability(true);
                System.out.println("Thank you!Enjoy the book");
                return;

            } else if(bookList.getId() != option){
                System.out.println("Sorry, that book is not available");
                return;
            }
        }
    }


    private static void selectOptions(int option) {

       //different menu options present
       switch (option) {
            case 1:
                System.out.println(getTheBooksList());
                break;

            case 2:
                System.out.println("Checkout a book");
                bookToBeCheckedOut();
                break;

            case 3:
                System.out.println ( "Exiting the application" );
                System.exit(1);
                break;

            default:
                System.err.println ( "Invalid option" );
                break;
        }
    }
    public static void theMenu() {
        selectOptions(readConsoleInput(menuOptions));
    }

}
