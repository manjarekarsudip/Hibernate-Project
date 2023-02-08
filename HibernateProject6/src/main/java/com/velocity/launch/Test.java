package com.velocity.launch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.velocity.entity.Answer;
import com.velocity.entity.Question;

public class Test {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Question question = new Question();
		question.setQuestion("What is Java");
		
		Answer a1 = new Answer();
		a1.setAnswer("Programming Lang");
		a1.setQuestion(question);
		
		Answer a2 = new Answer();
		a2.setAnswer("Chatbot");
		a2.setQuestion(question);
		
		Answer a3 = new Answer();
		a3.setAnswer("Coffee");
		a3.setQuestion(question);
		
		session.save(question);
		session.save(a1);
		session.save(a2);
		session.save(a3);
		
		transaction.commit();
		session.close();
	}
}
