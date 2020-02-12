package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import com.twu.biblioteca.contents.Books;
import com.twu.biblioteca.contents.Movies;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MenuOptionsTest {

    private ByteArrayOutputStream output;
    private PrintStream actual = System.out;

    @Before
    public void beforeEveryTest() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

    }

    @Test
    public void shouldDisplayAllTheOptions() {
        MenuOptions menu = new MenuOptions("Option 1", "Option 2", "Option 3");
        menu.printTheOptions();
        assertEquals("1. Option 1\n2. Option 2\n3. Option 3\n", output.toString());
    }

    @Test
    public void shouldGetTheListOfBooks() { //item.getTheListOfBooks();
        Items item = new Items(
                new Books("The Da Vince Code", "Dan Brown", 2000, 12),
                new Books("Harry Potter", "J.K. Rowling", 2001, 13),
                new Books("Shiva", "Amit Trivedi", 2002, 14),
                new Books("Mythos", "Stephen Fry", 2003, 15)
        );
        item.printTheListOfBooks();
        assertEquals("1. The Da Vince Code | Dan Brown | 2000 | 12\n2. Harry Potter | J.K. Rowling | 2001 | 13\n3. Shiva | Amit Trivedi | 2002 | 14\n4. Mythos | Stephen Fry | 2003 | 15\n",
                output.toString());
    }

   @Test
    public void shouldCheckoutTheBook() {
        Items item = new Items(
                new Books("The Da Vince Code", "Dan Brown", 2000, 12),
                new Books("Harry Potter", "J.K. Rowling", 2001, 13),
                new Books("Shiva", "Amit Trivedi", 2002, 14),
                new Books("Mythos", "Stephen Fry", 2003, 15)
        );
        item.bookToBeCheckedOut(3,item);
        assertEquals("Thank you! Enjoy the book\n", output.toString());
    }

    @Test
    public void shouldNotCheckoutTheBookWhenLessThan1() {
        Items item = new Items(
                new Books("The Da Vince Code", "Dan Brown", 2000, 12),
                new Books("Harry Potter", "J.K. Rowling", 2001, 13),
                new Books("Shiva", "Amit Trivedi", 2002, 14),
                new Books("Mythos", "Stephen Fry", 2003, 15)
        );
        item.bookToBeCheckedOut(0,item);
        assertEquals("Sorry, that book is not available\n",output.toString());
    }

    @Test
    public void shouldReturnTheBook() {
        Items item = new Items(
                new Books("The Da Vince Code", "Dan Brown", 2000, 12),
                new Books("Harry Potter", "J.K. Rowling", 2001, 13),
                new Books("Shiva", "Amit Trivedi", 2002, 14),
                new Books("Mythos", "Stephen Fry", 2003, 15)
        );
        item.bookToBeCheckedOut(4,item);
        item.bookToBeReturned("Mythos",item);
        assertEquals("Thank you! Enjoy the book\nThank you for returning the book\n", output.toString());
    }

    @Test
    public void shouldShowTheMovieListWhenOptionIs4() {
        Items item = new Items(
                new Movies("Movie1", 2001,"Director1", 7),
                new Movies("Movie2", 2002, "Director2", 8),
                new Movies("Movie3", 2003, "Director3", 9),
                new Movies("Movie4", 2004, "Director4", 10)
        );
        item.printTheListOfMovies();
        new MenuOptions().getOption(4);
        assertEquals("1. Movie1 | 2001 | Director1 | 7\n2. Movie2 | 2002 | Director2 | 8\n3. Movie3 | 2003 | Director3 | 9\n4. Movie4 | 2004 | Director4 | 10\n", output.toString());
    }

    @Test
    public void shouldCheckOutTheMovie() {
        Items item = new Items(
                new Movies("Movie1", 2001,"Director1", 7),
                new Movies("Movie2", 2002, "Director2", 8),
                new Movies("Movie3", 2003, "Director3", 9),
                new Movies("Movie4", 2004, "Director4", 10)
        );
        item.moviesToBeCheckedOut(4,item);
        assertEquals("Thank you! Enjoy the movie\n", output.toString());
    }

}
