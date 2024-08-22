package com.riwi.JPA.Controller.implementations;

import com.riwi.JPA.Controller.interfaces.UserController;
import com.riwi.JPA.entities.UserEntity;
import com.riwi.JPA.services.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
@RequestBody();
public class UserControllerImplementation implements UserController {

    @Autowired
    UserService userService;
    @Override
    @PostMapping("/create")
    public ResponseEntity<UserEntity> create(@RequestBody  UserEntity userEntity) {
        return ResponseEntity.ok(userService.save(userEntity));
    }
}
