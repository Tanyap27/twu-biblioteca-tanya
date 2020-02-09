package com.twu.biblioteca;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import com.twu.biblioteca.contents.bookList;

public class bookListTest {

    private bookList bookList;

    @Before
    public void beforEveryTest() {
        bookList = new bookList("Shiva", "Amit Trivedi", 2002, 14);
    }

    @Test
    public void shouldGetTheBookTitle() {
        assertEquals("Shiva", bookList.getTitle());
    }

    @Test
    public void shouldGetTheAuthor() {
        assertEquals("Amit Trivedi", bookList.getAuthor());
    }

    @Test
    public void shouldGetThePublicationYear() {
        assertEquals(2002, bookList.getPublicationYear());
    }

    @Test
    public void shouldGetTheBookId() {
        assertEquals(14, bookList.getId());
    }

}
