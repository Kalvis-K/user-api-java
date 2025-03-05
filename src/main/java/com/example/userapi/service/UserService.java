package com.example.userapi.service;

import com.example.userapi.model.Post;
import com.example.userapi.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public User getUser(Long id) {
        return new User(id, "John Doe", "john.doe@example.com");
    }

    public List<Post> getUserPosts(Long userId) {
        return List.of(
                new Post(1L, userId, "Post 1", "First random post"),
                new Post(2L, userId, "Post 2", "Second random post")
        );
    }
}

