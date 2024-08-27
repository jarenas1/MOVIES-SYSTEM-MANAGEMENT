package com.riwi.JPA.services.Implementations;

import com.riwi.JPA.entities.MovieEntity;
import com.riwi.JPA.repositories.MovieRepository;
import com.riwi.JPA.services.interfaces.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Movieimp implements MovieService {

    @Autowired
    MovieRepository movieRepository;
    
    @Override
    public MovieEntity readById(Long aLong) {
        return null;
    }
}
