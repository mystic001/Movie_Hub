package com.mystic.movieshub;

import java.io.Serializable;

public class Movie implements Serializable {
    private String name;
    private int rating;
    private String posterImages;
    private int year;
    private  String image;
    private String description;

    public Movie(String name, int rating, int year, String description, String image){
        this.image = image;
        this.name = name;
        this.rating = rating;
        this.year = year;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPosterImages() {
        return posterImages;
    }

    public void setPosterImages(String posterImages) {
        this.posterImages = posterImages;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
