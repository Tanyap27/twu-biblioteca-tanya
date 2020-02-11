package com.twu.biblioteca;

import com.twu.biblioteca.contents.Books;
import com.twu.biblioteca.contents.Movies;

import java.util.ArrayList;
import java.util.Arrays;

public class Items {

        private ArrayList<Books> listOfAvailableBooks;
        private ArrayList<Books> rentedBooks;
        private ArrayList<Movies> listOfAvailableMovies;
        private ArrayList<Movies> rentedMovies;

        public Items(Books... books) {
            listOfAvailableBooks = new ArrayList<Books>(Arrays.asList(books));
            rentedBooks = new ArrayList<Books>();
        }

        public Items(Movies... Movies) {
            listOfAvailableMovies = new ArrayList<Movies>(Arrays.asList(Movies));
            rentedMovies = new ArrayList<Movies>();
        }


        public ArrayList<Books> getBookList(Items items) {
            return items.listOfAvailableBooks;
        }

        public  void printTheListOfBooks() {
            for (int i = 0; i < listOfAvailableBooks.size(); i++) {
                System.out.println(i+1 + ". " + listOfAvailableBooks.get(i).toString());
            }
        }

        public static Books bookToBeCheckedOut(int chosenOption, Items items) {
            if (chosenOption <= 0 || chosenOption > items.listOfAvailableBooks.size()) {
                System.out.println("Sorry, that book is not available");
                return null;
            }
            Books rentedBook = items.listOfAvailableBooks.remove(chosenOption-1);
            items.rentedBooks.add(rentedBook);
            System.out.println("Thank you! Enjoy the book");
            return rentedBook;
        }

        public static void bookToBeReturned(String title, Items items) {
            for (Books Books : items.rentedBooks) {
                if (Books.getTitle().equals(title)) {
                    items.rentedBooks.remove(Books);
                    items.listOfAvailableBooks.add(Books);
                    System.out.println("Thank you for returning the book");
                    return;
                }
            }
            System.out.println("That is not a valid book to return");
        }

        public ArrayList<Movies> getMovieList(Items items) {
            return items.listOfAvailableMovies;
        }

        public  void printTheListOfMovies() {
            for (int i = 0; i < listOfAvailableMovies.size(); i++) {
                System.out.println(i+1 + ". " + listOfAvailableMovies.get(i).toString());
            }
        }

        public static Movies moviesToBeCheckedOut(int chosenOption, Items items) {
            if(chosenOption <= 0 || chosenOption > items.listOfAvailableMovies.size()) {
                System.out.println("Sorry that book is not available");
                return null;
            }
            Movies rentedMovie = items.listOfAvailableMovies.remove(chosenOption-1);
            items.rentedMovies.add(rentedMovie);
            System.out.println("Thank you! Enjoy the movie");
            return rentedMovie;
            }
        }



