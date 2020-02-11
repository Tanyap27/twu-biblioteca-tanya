package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

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
    public void shouldPrintTheGreetings() {
        String welcome = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        //assertEquals(welcome, BibliotecaApp.greetings());
        assertThat(BibliotecaApp.greetings(), is(welcome));

    }

}
