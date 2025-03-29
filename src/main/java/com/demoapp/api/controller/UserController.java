package com.demoapp.api.controller;

import com.demoapp.api.models.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public List<User> getUsers() {
        return Arrays.asList(
                new User("1", "John Doe", "john@example.com"),
                new User("2", "Jane Smith", "jane@example.com"),
                new User("3", "Alice Johnson", "alice@example.com")
        );
    }
}
