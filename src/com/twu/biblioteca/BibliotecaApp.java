package com.twu.biblioteca;

public class BibliotecaApp {

    static String greetings() {
        return ( "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
    }

    private static MenuOptions menuOptions;
    private static Login login;


    public static void main(String[] args) {

        System.out.println(greetings());

        while(true) {
            String Option = MenuOptions.getMenuOption();

            if (Option.equals("To open the book menu, please select 1")) {
               StoreManager.book.printTheListOfBooks();

            } else if (Option.equals("To checkout a book, select 2")) {
                MenuOptions.bookToBeCheckedOut(StoreManager.book);

            } else if (Option.equals("To return a book, select 3")) {
                menuOptions.bookToBeReturned(StoreManager.book);

            }
            else if (Option.equals("To open the movie menu, please select 4")) {
                StoreManager.movie.printTheListOfMovies();
            }
            else if (Option.equals("To checkout a movie, select 5")) {
                menuOptions.movieToBeCheckedOut(StoreManager.movie);

            } else if (Option.equals("Login")) {
                menuOptions.loggingIn();

            } else if (Option.equals("To quit, please select 6")) {
                System.exit(0);

            } else {
                System.out.println(Option);

            }

            System.out.println();
        }

    }
}