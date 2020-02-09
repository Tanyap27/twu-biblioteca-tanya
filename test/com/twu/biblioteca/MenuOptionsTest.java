package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import com.twu.biblioteca.contents.bookList;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
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
                new bookList("The Da Vince Code", "Dan Brown", 2000, 12),
                new bookList("Harry Potter", "J.K. Rowling", 2001, 13),
                new bookList("Shiva", "Amit Trivedi", 2002, 14),
                new bookList("Mythos", "Stephen Fry", 2003, 15)
        );
        item.printTheListOfBooks();
        assertEquals("1. The Da Vince Code | Dan Brown | 2000 | 12\n2. Harry Potter | J.K. Rowling | 2001 | 13\n3. Shiva | Amit Trivedi | 2002 | 14\n4. Mythos | Stephen Fry | 2003 | 15\n",
                output.toString());
    }

   @Test
    public void shouldCheckoutTheBook() {
        Items item = new Items(
                new bookList("The Da Vince Code", "Dan Brown", 2000, 12),
                new bookList("Harry Potter", "J.K. Rowling", 2001, 13),
                new bookList("Shiva", "Amit Trivedi", 2002, 14),
                new bookList("Mythos", "Stephen Fry", 2003, 15)
        );
        item.bookToBeCheckedOut(3,item);
        assertEquals("Thank you! Enjoy the book\n", output.toString());
    }

    @Test
    public void shouldNotCheckoutTheBookWhenLessThan1() {
        Items item = new Items(
                new bookList("The Da Vince Code", "Dan Brown", 2000, 12),
                new bookList("Harry Potter", "J.K. Rowling", 2001, 13),
                new bookList("Shiva", "Amit Trivedi", 2002, 14),
                new bookList("Mythos", "Stephen Fry", 2003, 15)
        );
        item.bookToBeCheckedOut(0,item);
        assertEquals("Sorry, that book is not available\n",output.toString());
    }
}
