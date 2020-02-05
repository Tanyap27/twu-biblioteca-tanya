package com.twu.biblioteca;

import org.junit.Test;

import com.twu.biblioteca.BibliotecaApp;
import com.twu.biblioteca.contents.bookList;
import static org.junit.Assert.assertThat;
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
    public void getTheListOfBooksTest() {
        List<String> expected = Arrays.asList("The Da Vince Code", "Harry Potter", "Shiva", "Mythos");
        new BibliotecaApp();
        List<bookList> listOfTheBooks = BibliotecaApp.getTheBooksList();
        List<String> listOfTitle = listOfTheBooks.stream().map(bookList::getTitle).collect(Collectors.toList()) ;
        assertThat(listOfTitle, is(expected));
    }

}
