package com.twu.biblioteca.contents;
import com.twu.biblioteca.contents.Books;
import java.util.ArrayList;

public class Users {

    private String libraryNumber;
    private String password;
    private ArrayList<Books> books;

    public Users(String libraryNumber, String password) {
        this.libraryNumber = libraryNumber;
        this.password = password;
        this.books = new ArrayList<Books>();
    }

    public ArrayList<Books>getBooks() {
        return books;
    }

    public void checkOutBooks(Books book) {
        books.add(book);
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public String getPassword() {
        return password;
    }

    public String displayUser() {
        return this.libraryNumber +  " | " + this.password;
    }

}
