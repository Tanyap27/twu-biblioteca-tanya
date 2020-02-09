package com.twu.biblioteca;

import com.twu.biblioteca.Items;
import java.util.Scanner;

public class MenuOptions {

    private static String[] options;
    private static MenuOptions menuOptions = new MenuOptions(
                    "To open the book menu, please select 1", "To checkout a book, select 2", "To return a book, select 3", "To quit, please select 4");

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

    //get the options
     static String getMenuOption() {
        //to read the option
        Scanner read = new Scanner(System.in);
        menuOptions.printTheOptions();
        System.out.println("Select the Option");
        int reads = read.nextInt();
        return menuOptions.getOption(reads);
     }

     static void bookToBeCheckedOut(Items items){
        Scanner read = new Scanner(System.in);
        //new BibliotecaApp().getTheBooksList();
         items.printTheListOfBooks();
        System.out.print("Select book from list: ");
        int reads = read.nextInt();
        //new Items().checkOutBook(reads);
         new Items().bookToBeCheckedOut(reads, items);
    }

}
