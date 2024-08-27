package com.riwi.JPA.services.interfaces;

import com.riwi.JPA.entities.MovieEntity;
import com.riwi.JPA.services.CRUD.ReadById;

public interface MovieService extends ReadById<MovieEntity, Long> {


}
