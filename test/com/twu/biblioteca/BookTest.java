package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import com.twu.biblioteca.contents.bookList;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private bookList book;
    private MenuOptions Menu;

    @Before
    public void sampleBook() {

        book = new bookList("Shiva", "Amit Trivedi", 2002, 14);
    }

    @Test
    public void shouldGetTitle() {
        assertEquals("Shiva", book.getTitle());

    }

    @Test
    public void shouldGetAuthor() {
        assertEquals("Amit Tivedi", book.getAuthor());

    }

    @Test
    public void shouldGetPublicationYear() {
        assertEquals(2002, book.getPublicationYear());

    }

    @Test
    public void shouldGetId() {
        assertEquals(14, book.getId());

    }

}
