package com.example.userapi.controller;

import com.example.userapi.model.Post;
import com.example.userapi.model.User;
import com.example.userapi.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @GetMapping("/{id}/posts")
    public List<Post> getUserPosts(@PathVariable Long id) {
        return userService.getUserPosts(id);
    }
}

