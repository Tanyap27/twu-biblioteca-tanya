package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import com.twu.biblioteca.contents.bookList;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BibliotecAppTest {

    private ByteArrayOutputStream output;
    private PrintStream actual = System.out;

    @Before
    public void beforeEveryTest() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

    }

    @Test
    public void greetingsTest() {
        String welcome = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        //assertEquals(welcome, BibliotecaApp.greetings());
        assertThat(BibliotecaApp.greetings(), is(welcome));

    }


    @Test
    public void shouldGetTheListOfBooks() { //item.getTheListOfBooks();
        Items item = new Items(
                new bookList("The Da Vince Code", "Dan Brown", 2000, 12),
                new bookList("Harry Potter", "J.K. Rowling", 2001, 13),
                new bookList("Shiva", "Amit Trivedi", 2002, 14),
                new bookList("Mythos", "Stephen Fry", 2003, 15)
        );
        item.getTheListOfBooks();
        assertEquals("The Da Vince Code | Dan Brown | 2000 | 12\nHarry Potter | J.K. Rowling | 2001 | 13\nShiva | Amit Trivedi | 2002 | 14\nMythos | Stephen Fry | 2003 | 15\n",
                output.toString());
    }

}
