package com.velocity.demo1;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Customer customer = new Customer();
		customer.setName("Sudip");
		customer.setMobNo(98765432);
		
		Shop shop =new Shop();
		shop.setDate(new Date());
		shop.setTotal(5000);
		
		customer.setShop(shop);
		session.save(shop);
		session.save(customer);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

}
