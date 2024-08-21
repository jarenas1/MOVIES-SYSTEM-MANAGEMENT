package com.riwi.JPA.entities;

import jakarta.persistence.*;

import java.sql.Time;

@Entity
@Table(name = "movie")
public class MovieEntity {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    private String genre;
    private Time duration;
    private Integer reating;
    private Float price;


    //getters and s

    
}
