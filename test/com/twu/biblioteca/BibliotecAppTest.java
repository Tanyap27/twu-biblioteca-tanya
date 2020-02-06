package com.twu.biblioteca;

import org.junit.Test;

import com.twu.biblioteca.BibliotecaApp;
import com.twu.biblioteca.contents.bookList;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BibliotecAppTest {
    @Test
    public void greetingsTest() {
        String welcome = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        //assertEquals(welcome, BibliotecaApp.greetings());
        assertThat(BibliotecaApp.greetings(), is(welcome));

    }

    @Test
    public void shouldGetTheListOfBooks() {
       /* Items item = new Items(
                new bookList("The Da Vince Code", "Dan Brown", 2000, 12),
                new bookList("Harry Potter", "J.K. Rowling", 2001, 13),
                new bookList("Shiva", "Amit Trivedi", 2002, 14),
                new bookList("Mythos", "Stephen Fry", 2003, 15)
        );
        item.getTheListOfBooks();
        assertEquals(item.getTheListOfBooks(), is(item));*/
    }

}
