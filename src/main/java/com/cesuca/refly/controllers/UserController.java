package com.cesuca.refly.controllers;

import com.cesuca.refly.entities.User;
import com.cesuca.refly.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserServices service;

    @PostMapping
    public User addUser(@RequestBody User newUser) {
        return service.addUser(newUser);
    }

}
