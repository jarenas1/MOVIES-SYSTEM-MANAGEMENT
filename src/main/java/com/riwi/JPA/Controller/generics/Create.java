package com.riwi.JPA.Controller.generics;

import org.springframework.http.ResponseEntity;

public interface Create<Entity> {
    public ResponseEntity<Entity> create (Entity entity);
}
