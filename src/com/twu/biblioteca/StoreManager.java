package com.twu.biblioteca;

import com.twu.biblioteca.contents.Books;
import com.twu.biblioteca.contents.Movies;

public class StoreManager {

    public static Items book = new Items (
            new Books("The Da Vince Code", "Dan Brown", 2000, 12),
            new Books("Harry Potter", "J.K. Rowling", 2001, 13),
            new Books("Shiva", "Amit Trivedi", 2002, 14),
            new Books("Mythos", "Stephen Fry", 2003, 15)
    );

    public static Items movie = new Items(
            new Movies("Movie1", 2001,"Director1", 7),
            new Movies("Movie2", 2002, "Director2", 8),
            new Movies("Movie3", 2003, "Director3", 9),
            new Movies("Movie4", 2004, "Director4", 10)
    );
}
