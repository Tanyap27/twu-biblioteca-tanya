package com.twu.biblioteca.contents;

public class bookList {

    //declare the variables
    private String title;

    private String author;

    private int publicationYear;

    private int id;

    boolean isAvailable = false;

    //constructor to change the variable
    public bookList(String title, String author, int publicationYear, int id) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.id = id;

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

    public int getId() {
        return id;
    }

    public boolean getAvailablity() {
        return isAvailable;
    }

    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    //returns details of the books
   public String toString()
    {
        return "The details of the book are: " + title + ", " + author + ", "  + publicationYear + "," + id ;
    }
}
