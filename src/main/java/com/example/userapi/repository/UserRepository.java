package com.example.userapi.repository;

import com.example.userapi.model.Post;
import com.example.userapi.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

    private final List<User> users = List.of(
            new User(1L, "John Doe", "john.doe@example.com"),
            new User(2L, "Peter Smith", "peter.smith@example.com"),
            new User(3L, "Bob Johnson", "bob.johnson@example.com")
    );

    private final List<Post> posts = List.of(
            new Post(1L, 1L, "John's First Post", "Content of John's first post"),
            new Post(2L, 1L, "John's Second Post", "Content of John's second post"),
            new Post(3L, 2L, "Peter's Post", "Content of Peter's post"),
            new Post(4L, 3L, "Bob's Post", "Content of Bob's post")
    );

    public Optional<User> getUserById(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    public List<Post> getPostsByUserId(Long userId) {
        return posts.stream().filter(post -> post.getUserId().equals(userId)).toList();
    }
}
