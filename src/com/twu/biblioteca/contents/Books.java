package com.twu.biblioteca.contents;

public class Books {

    //declare the variables
    private String title;

    private String author;

    private int publicationYear;

    private int id;

    //constructor to change the variable
    public Books(String title, String author, int publicationYear, int id) {
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

    //returns details of the books
   public String toString()
    {
        return this.title + " | " + this.author + " | "  + this.publicationYear + " | " + this.id;
    }
}
