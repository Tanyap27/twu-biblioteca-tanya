package com.twu.biblioteca;

import java.util.*;
import com.twu.biblioteca.Items;

public class MenuOptions {

    private String[] options;

    public MenuOptions(String... options) {
        this.options = options;
    }

    public void printTheOptions() {
        for (int i = 0; i < options.length; i++) {
            System.out.println(i+1 + ". " + options[i]);
        }
    }

    public  String getOption(int choice) {
        if (choice < 0 || choice > options.length) {
            return "";
        }
        return this.options[choice-1];
    }

     static String getMenuOption() {

        //to read the option
        Scanner read = new Scanner(System.in);
        printTheOptions();
        System.out.println("Select the Option");
        int reads = read.nextInt();
        return getOption(reads);
        }

     static void bookToBeCheckedOut(){
        Scanner sc = new Scanner(System.in);
        Items.getTheListOfBooks();
        System.out.print("Select book from list: ");
        int in = sc.nextInt();
        Items.bookToBeCheckedOut(in);
    }

    public void menuOptions() {

        //different options present
        while(true) {
            String menuOption = getMenuOption();

            if (menuOption.equals("To open the book menu, please select 1")) {
                Items.getTheListOfBooks();

            } else if (menuOption.equals("To checkout, select 2")) {
                bookToBeCheckedOut();

            } else if (menuOption.equals("To quit, please select 4")) {
                System.exit(0);

            } else {
                System.out.println(menuOption);

            }

            System.out.println();
        }

    }

    /*public static void bookToBeCheckedOut() {

        List<bookList> listOfTheBooks = getTheBooksList();
        String message = "Select the id of the book to be checked out\n" + listOfTheBooks.toString();

        int option = readConsoleInput(message);

         for(int i = 0; i < listOfTheBooks.size(); i ++) {
            bookList bookList = listOfTheBooks.get(i);
            System.out.println(bookList);

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


    public static void selectOptions(int option) {

        //different menu options present
        String message = "";
        if (option == 1) {
            message += getTheBooksList();

        } else if (option == 2) {
            bookToBeCheckedOut();

        } else if (option == 3) {
            System.out.println("Exiting the application");
            System.exit(1);

        } else {
            System.err.println("Invalid option");

            System.out.println(message);

        }

    }

    public static void theMenu() {
        selectOptions(readConsoleInput(menuOptions));
    }*/

}
