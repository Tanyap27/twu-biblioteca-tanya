package com.twu.biblioteca;

import com.twu.biblioteca.contents.bookList;

public class BibliotecaApp {

   //greet the user
    static String greetings() {
        return ( "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
    }
        //get the list of books from bookList
       private static Items item = new Items (
                new bookList("The Da Vince Code", "Dan Brown", 2000, 12),
                new bookList("Harry Potter", "J.K. Rowling", 2001, 13),
                new bookList("Shiva", "Amit Trivedi", 2002, 14),
                new bookList("Mythos", "Stephen Fry", 2003, 15)
        );

    public static void main(String[] args) {
        // show the welcome message!
        System.out.println(greetings());

        //different options present
        while(true) {
            String Option = MenuOptions.getMenuOption();

            if (Option.equals("To open the book menu, please select 1")) {
               item.printTheListOfBooks();

            } else if (Option.equals("To checkout a book, select 2")) {
                MenuOptions.bookToBeCheckedOut(item);

            } else if (Option.equals("To return a book, select 3")) {
                MenuOptions.bookToBeReturned(item);

            } else if (Option.equals("To quit, please select 4")) {
                System.exit(0);

            } else {
                System.out.println(Option);

            }

            System.out.println();
        }

    }
}