package com.twu.biblioteca.contents;

public class Movies {

    //declare the variables
    private String name;

    private int year;

    private String director;

    private int rating;

    //constructor to change the variable
    public Movies(String name, int year, String director, int rating) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;

    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public int getRating() {
        return rating;
    }

    public String toString()
    {
        return this.name + " | " + this.year + " | "  + this.director + " | " + this.rating;
    }
}
