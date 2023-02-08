package com.velocity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Student s1 = (Student) session.get(Student.class, 1);
		System.out.println("First Student Data is : "+s1);
		
		Student s2 = (Student) session.get(Student.class, 1);
		System.out.println("Second Student Data is : "+s2);

	}

}
