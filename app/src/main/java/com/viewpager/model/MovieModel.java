package com.viewpager.model;

public class MovieModel
{

    private String nameMovie, categoryMovie, releaseMovie;
    private int poster;
    private float ratingMovie;


    public MovieModel(String nameMovie, String categoryMovie, String releaseMovie, int poster, float ratingMovie)
    {
        this.nameMovie = nameMovie;
        this.categoryMovie = categoryMovie;
        this.releaseMovie = releaseMovie;
        this.poster = poster;
        this.ratingMovie = ratingMovie;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public String getCategoryMovie() {
        return categoryMovie;
    }

    public String getReleaseMovie() {
        return releaseMovie;
    }

    public int getPoster() {
        return poster;
    }

    public float getRatingMovie() {
        return ratingMovie;
    }
}
