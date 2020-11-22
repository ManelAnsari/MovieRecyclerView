package com.example.movierecyclerview;

public class Movie {
    private String title, genre, year;

    public Movie() {
    }

    public Movie(String title, String genre, String year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }
    public String getTitle()
    {
        return title;
    }
    public String getYear()
    {
        return year;
    }
    public String getGenre()
    {
        return genre;
    }
}
