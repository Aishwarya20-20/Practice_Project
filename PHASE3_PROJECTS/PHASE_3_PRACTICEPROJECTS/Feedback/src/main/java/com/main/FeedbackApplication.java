package com.main;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

import com.project.Feedback.entities.Feedback;
import com.project.Feedback.repositories.FeedbackRepository;

@SuppressWarnings("unused")
@SpringBootTest
public class FeedbackApplication {
	
	@Autowired
	EntityManager entityManager;
	
	@Autowired
	FeedbackRepository feedbackRepo;
	
//	@Autowired
	
	@Test
	void shouldFindByUser() {
		Feedback testFeedback = new Feedback("Dummy Test", 5, "dummy");
		entityManager.persist(testFeedback);
		entityManager.flush();
		
		//Assertions.assertEquals(cmp.getUser(), testFeedback.getUser());
	}

	@SuppressWarnings("unused")
	private void assertEquals1(Object user, Object user2) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unused")
	private void assertEquals(Object user, Object user2) {
		// TODO Auto-generated method stub
		
	}
}