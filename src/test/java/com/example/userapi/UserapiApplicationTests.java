package com.example.userapi;

import com.example.userapi.model.Post;
import com.example.userapi.model.User;
import com.example.userapi.service.UserService;
import com.example.userapi.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserapiApplicationTests {

	private UserService userService;

	@BeforeEach
	void setup() {
		userService = new UserService(new UserRepository());
	}

	@Test
	void testGetUser() {
		User user = userService.getUser(1L);
		assertNotNull(user);
		assertEquals("John Doe", user.getName());

		User user2 = userService.getUser(2L);
		assertEquals("Peter Smith", user2.getName());
	}

	@Test
	void testGetUserPosts() {
		List<Post> posts = userService.getUserPosts(1L);
		assertFalse(posts.isEmpty());
		assertEquals(2, posts.size());
		assertEquals("John's First Post", posts.get(0).getTitle());

		List<Post> alicePosts = userService.getUserPosts(2L);
		assertEquals(1, alicePosts.size());
		assertEquals("Peter's Post", alicePosts.get(0).getTitle());
	}
}

