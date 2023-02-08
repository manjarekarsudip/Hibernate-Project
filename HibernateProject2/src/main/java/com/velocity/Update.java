package com.velocity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Employee emp = (Employee) session.get(Employee.class, 5);
		emp.setFullName("Hritik R");
		session.update(emp);
		
		session.getTransaction().commit();
		session.close();
	}

}
