package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BibliotecAppTest {
    @Test
    public void test() {
        BibliotecaApp biblioteca = new BibliotecaApp();
        String welcome = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        assertEquals(welcome, biblioteca.greetings());

    }
}
