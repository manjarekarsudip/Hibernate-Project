package com.velocity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Student s1 = (Student) session.load(Student.class, 1);
		System.out.println("First student data is :"+ s1);
		
		System.out.println("Second Level Cache ::");
		Session session1 = sessionFactory.openSession();
		Student s2 = (Student)session1.load(Student.class, 1);
		System.out.println("Student Data is :" + s2);
		
	}

}
