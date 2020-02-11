package com.twu.biblioteca;

import com.twu.biblioteca.contents.Movies;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieListTest {

    private Movies Movies;

    @Before
    public void beforEveryTest() {
        Movies = new Movies("Movie1", 2001, "Director1", 7);
    }

    @Test
    public void shouldGetTheMovieName() {
        assertEquals("Movie1", Movies.getName());
    }

    @Test
    public void shouldGetTheMovieYear() {
        assertEquals(2001, Movies.getYear());
    }

    @Test
    public void shouldGetTheMovieDirector() {
        assertEquals("Director1", Movies.getDirector());
    }

    @Test
    public void shouldGetTheMovieRating() {
        assertEquals(7, Movies.getRating());
    }
}