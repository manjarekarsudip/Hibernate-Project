package com.velocity;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		//step 1
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		//step 2
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		//step 3
		Session session = sessionFactory.openSession();
		//step 4
		Transaction transaction = session.beginTransaction();
		//step 5
		Student student = new Student();
		student.setFirstName("Sudip");
		student.setLastName("Manjarekar");
		//step 6
		session.save(student);
		transaction.commit();
		session.close();
		
		System.out.println("Data is saved..");
	}
}
