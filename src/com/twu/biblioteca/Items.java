package com.twu.biblioteca;

import com.twu.biblioteca.contents.bookList;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Items {

        private  ArrayList<bookList> listOfAvailableBooks;
        private  ArrayList<bookList> rentedBookList;

        public Items(bookList... booksLists) {
            listOfAvailableBooks = new ArrayList<bookList>(Arrays.asList(booksLists));
            rentedBookList = new ArrayList<bookList>();
        }

        public ArrayList<bookList> getBookList(Items items) {
            return items.listOfAvailableBooks;
        }

        public  void printTheListOfBooks() {
            for (int i = 0; i < listOfAvailableBooks.size(); i++) {
                System.out.println(i+1 + ". " + listOfAvailableBooks.get(i).toString());
            }
        }

        public bookList bookToBeCheckedOut(int chosenOption, Items items) {
            if (chosenOption <= 0 || chosenOption > items.listOfAvailableBooks.size()) {
                System.out.println("Sorry, that book is not available");
                return null;
            }
            bookList rentedBook = items.listOfAvailableBooks.remove(chosenOption-1);
            rentedBookList.add(rentedBook);
            System.out.println("Thank you! Enjoy the book");
            return rentedBook;
        }

    }


