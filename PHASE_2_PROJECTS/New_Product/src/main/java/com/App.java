package com;


	import java.lang.module.Configuration;
import java.util.List;

import org.apache.catalina.Session;

import com.mysql.cj.xdevapi.SessionFactory;
	public class App {
	
	 public static void main( String[] args )
	 {
	// Get the SessionFactory
	 SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
	 
	.addAnnotatedClass(students.class)
	 .buildSessionFactory();
	 
	// Get the Session
	 Session theSession = ((Object) factory).getCurrentSession();
	 
	 try {
	// Add a new learner
	 students theLearner = new students();
	 
	 
	// Start the transaction
	 ((Object) theSession).beginTransaction();
	 
	// Save the learner
	 theSession.save(theLearner);
	 
	// Commit the transaction
	 theSession.getTransaction().commit();
	 System.out.println("new students sucessfully inserted ");
	 System.out.println("Learner id : " + theLearner.name);
	 
	// Learner learner = theSession.get(Learner.class, 2);
	// 
	// System.out.println("Learner details by id : " + learner);
	 
	 
	 
	 
	 }finally {
	 factory.close();
	 }
	 }
}
