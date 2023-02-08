package com.velocity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Student student = new Student();
		student.setName("Sudip");
		student.setAddress("Mumbai");
		student.setMobNum("8374621");
		
		session.save(student);
		session.getTransaction().commit();
		session.close();
	}

}
