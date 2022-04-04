package com.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;


@SpringBootTest
public class AuthenticationDetails {

	@Autowired
	private UserService userService;
	
	@org.junit.Test
	void contextLoads() {
	}

	
	@org.junit.Test
	void testServiceCall() {
		Iterable<User> users = userService.GetAllUsers();
		Integer count = 0;
		
		for(User u: users)
			count++;
		
		assertNotEquals(count, 0);
	}
	
	private void assertNotEquals(Integer count, int i) {
		// TODO Auto-generated method stub
		
	}


	@org.junit.Test
	void countUsers() {
		Iterable<User> users = userService.GetAllUsers();
		Integer count = 0;
		
		for(User u: users)
			count++;
		
		
	}
	
	@org.junit.Test
	void checkAllUsers() {
		Iterable<User> users = userService.GetAllUsers();
		
		for(User u: users)
			assertNotNull(u);
	}


	private void assertNotNull(User u) {
		// TODO Auto-generated method stub
		
	}
}