package com.example.deemocardview;

public class Movie {
    private Integer image;
    private String movieName;
    private String  derectorName;

    public Movie() {
    }

    public Integer getImage() {
        return image;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getDerectorName() {
        return derectorName;
    }

    public Movie(Integer image, String movieName, String derectorName) {
        this.image = image;
        this.movieName = movieName;
        this.derectorName = derectorName;



    }


}
