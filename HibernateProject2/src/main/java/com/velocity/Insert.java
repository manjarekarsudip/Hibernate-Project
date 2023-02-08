package com.velocity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Insert {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Employee emp1 = new Employee();
		emp1.setFullName("Sudip");
		emp1.setAddress("Mumbai");
		emp1.setSalary(30000);
		
		Employee emp2 = new Employee();
		emp2.setFullName("Vishal");
		emp2.setAddress("Kolhapur");
		emp2.setSalary(32000);
		
		Employee emp3 = new Employee();
		emp3.setFullName("Kiran");
		emp3.setAddress("Pathan");
		emp3.setSalary(28000);
		
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		
		session.getTransaction().commit();
		session.close();
	}

}
