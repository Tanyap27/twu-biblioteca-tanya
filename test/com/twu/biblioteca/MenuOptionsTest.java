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
}
