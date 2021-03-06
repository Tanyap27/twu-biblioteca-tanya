package com.twu.biblioteca;

import com.twu.biblioteca.Items;
import com.twu.biblioteca.Login;

import java.util.Scanner;


public class MenuOptions {

    private static Login login;
    private static String[] options;
    private static MenuOptions loggedInMenuOptions = new MenuOptions(
                    "To open the book menu, please select 1", "To checkout a book, select 2", "To return a book, select 3", "To open the movie menu, please select 4",
            "To checkout a movie, select 5","Login","To quit, please select 6");

    public MenuOptions(String... options) {
        MenuOptions.options = options;
    }

    public void printTheOptions() {
        for (int i = 0; i < options.length; i++) {
            System.out.println(i+1 + ". " + options[i]);
        }
    }

    public String getOption(int chosenOption) {
        if (chosenOption < 1 || chosenOption > options.length) {
            return "This is not a valid option";
        }
        return options[chosenOption-1];
    }

    public static void loggingIn() {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter libraryNumber: ");
        String libraryNumber = read.nextLine();
        System.out.print("Enter password: ");
        String password = read.nextLine();
        login.loggingIn(libraryNumber, password);
    }

    //get the options
     static String getMenuOption() {
        //to read the option
        Scanner read = new Scanner(System.in);
        loggedInMenuOptions.printTheOptions();
        System.out.println("Select the Option");
        int reads = read.nextInt();
        return loggedInMenuOptions.getOption(reads);
     }

     static void bookToBeCheckedOut(Items items){
        Scanner read = new Scanner(System.in);
        items.printTheListOfBooks();
        System.out.print("Select book from list: ");
        int reads = read.nextInt();
        Items.bookToBeCheckedOut(reads, items);
    }

    static void bookToBeReturned(Items items) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter title of book to return: ");
        String title = read.nextLine();
        Items.bookToBeReturned(title, items);
    }

    static void movieToBeCheckedOut(Items items) {
        Scanner read = new Scanner(System.in);
        items.printTheListOfMovies();
        System.out.println("Select movie from the list:");
        int reads = read.nextInt();
        Items.moviesToBeCheckedOut(reads,items);
    }

     static void printUserInfo() {

    }

}
