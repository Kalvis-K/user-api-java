package com.example.userapi;

import com.example.userapi.model.Post;
import com.example.userapi.model.User;
import com.example.userapi.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserapiApplicationTests {

	@Test
	void testGetUser() {
		UserService userService = new UserService();
		User user = userService.getUser(1L);

		assertNotNull(user);
		assertEquals("John Doe", user.getName());
	}

	@Test
	void testGetUserPosts() {
		UserService userService = new UserService();
		Long userId = 1L;

		List<Post> posts = userService.getUserPosts(userId);

		assertNotNull(posts);
		assertEquals(2, posts.size());
		assertEquals("Post 1", posts.get(0).getTitle());
		assertEquals("Post 2", posts.get(1).getTitle());
	}
}
