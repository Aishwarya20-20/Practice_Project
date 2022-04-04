package com.project;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.hibernate.usertype.UserType;
import org.junit.experimental.theories.suppliers.TestedOn;



@DataJpaTest

public class AuthenticationTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    
    @TestedOn
    public void returnUserFromName() {
        org.apache.tomcat.jni.User testUser = new org.apache.tomcat.jni.User();
        testUser.setName("newTest");
         testUser.setEmail("test@email.com");
        testUser.setPassword("testpw");
        entityManager.persist(testUser);
        entityManager.flush();

        UserType found = userRepository.findByName(testUser.getName());

        assertEquals(found.getName(), testUser.getName());
    }

    @Test
    public void passwordNotNull() {
    	
		Iterable<org.springframework.boot.autoconfigure.security.SecurityProperties.User> users = userRepository.findAll();
		for(org.springframework.boot.autoconfigure.security.SecurityProperties.User u: users)
			assertNotNull(u.getPassword());
    }

    @org.junit.Test
    public void nameNotNull() {
    	
		Iterable<org.springframework.boot.autoconfigure.security.SecurityProperties.User> users = userRepository.findAll();
		for(org.springframework.boot.autoconfigure.security.SecurityProperties.User u: users)
			assertNotNull(u.getName());
    }

    @org.junit.Test
    public void emailNotNull() {
    	
		Iterable<org.springframework.boot.autoconfigure.security.SecurityProperties.User> users = userRepository.findAll();
		for(org.springframework.boot.autoconfigure.security.SecurityProperties.User u: users)
			assertNotNull(((com.project.User) u).getEmail());
    }

	private void assertNotNull(Object email) {
		// TODO Auto-generated method stub
		
	}


}