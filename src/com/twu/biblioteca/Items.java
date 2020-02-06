package com.twu.biblioteca;

import com.twu.biblioteca.contents.bookList;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Items {

        private  ArrayList<bookList> listOfTheBooks;
        private  ArrayList<bookList> rentedBookList;

        public Items(bookList... books) {
            listOfTheBooks = new ArrayList<bookList>(Arrays.asList(books));
            rentedBookList = new ArrayList<bookList>();
        }

        /*public ArrayList<bookList> getBookList() {
            return this.listOfTheBooks;
        }*/

        public  void getTheListOfBooks() {
            for(bookList bookList: listOfTheBooks) {
                System.out.println(bookList.toString());
            }
        }

        public boolean bookToBeCheckedOut(int choice) {
            if (choice <= 0 || choice > listOfTheBooks.size()) {
                return false;
        }
            listOfTheBooks.remove(choice - 1);
            System.out.println("Thank you! Enjoy the book");
            return true;
    }


}
