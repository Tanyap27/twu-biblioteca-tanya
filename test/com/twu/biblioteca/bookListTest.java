package com.twu.biblioteca;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import com.twu.biblioteca.contents.Books;

public class bookListTest {

    private Books Books;

    @Before
    public void beforEveryTest() {
        Books = new Books("Shiva", "Amit Trivedi", 2002, 14);
    }

    @Test
    public void shouldGetTheBookTitle() {
        assertEquals("Shiva", Books.getTitle());
    }

    @Test
    public void shouldGetTheAuthor() {
        assertEquals("Amit Trivedi", Books.getAuthor());
    }

    @Test
    public void shouldGetThePublicationYear() {
        assertEquals(2002, Books.getPublicationYear());
    }

    @Test
    public void shouldGetTheBookId() {
        assertEquals(14, Books.getId());
    }

}
