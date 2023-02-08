package com.velocity.launch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.velocity.entity.Answer;

public class Test2 {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Answer answer = session.get(Answer.class, 1);
		System.out.println(answer.getAnswer());
		transaction.commit();
		session.close();
		
	}
}
