package com.twu.biblioteca;

import com.twu.biblioteca.contents.movieList;
import org.junit.Before;
import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class MovieListTest {

    private movieList movieList;

    @Before
    public void beforEveryTest() {
        movieList = new movieList("Movie1", 2001, "Director1", 7);
    }

    @Test
    public void shouldGetTheMovieName() {
        assertEquals("Movie1", movieList.getName());
    }

    @Test
    public void shouldGetTheMovieYear() {
        assertEquals(2001, movieList.getYear());
    }

    @Test
    public void shouldGetTheMovieDirector() {
        assertEquals("Director1", movieList.getDirector());
    }

    @Test
    public void shouldGetTheMovieRating() {
        assertEquals(7, movieList.getRating());
    }
}