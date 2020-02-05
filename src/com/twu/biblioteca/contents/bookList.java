package com.twu.biblioteca.contents;

public class bookList {

    //declare the variables
    public String title;

    public String author;

    public int publicationYear;

    //constructor to change the variable
    public bookList(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    //return the input given by user
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    //returns details of the books
   public String toString()
    {
        return "The details of the book are: " + title + ", " + author + ", "  + publicationYear;
    }
}
