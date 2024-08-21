package com.riwi.JPA.entities;

import jakarta.persistence.*;

import java.sql.Time;

@Entity
@Table(name = "movie")
public class MovieEntity {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String genre;
    private Time duration;
    private Integer reating;
    private Float price;


    //getters and s


    public MovieEntity() {
    }

    public MovieEntity(Time duration, String genre, Long id, Float price, Integer reating, String title) {
        this.duration = duration;
        this.genre = genre;
        this.id = id;
        this.price = price;
        this.reating = reating;
        this.title = title;
    }

    public Time getDuration() {
        return duration;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getReating() {
        return reating;
    }

    public void setReating(Integer reating) {
        this.reating = reating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "MovieEntity{" +
                "duration=" + duration +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", reating=" + reating +
                ", price=" + price +
                '}';
    }
}
