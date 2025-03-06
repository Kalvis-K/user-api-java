package com.example.userapi.service;

import com.example.userapi.model.Post;
import com.example.userapi.model.User;
import com.example.userapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(Long id) {
        return userRepository.getUserById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    public List<Post> getUserPosts(Long userId) {
        return userRepository.getPostsByUserId(userId);
    }
}

