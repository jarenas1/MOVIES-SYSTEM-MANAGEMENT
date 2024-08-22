package com.riwi.JPA.services.CRUD;

public interface ReadById <Entity,id>{

    public Entity readById(id id);
}
