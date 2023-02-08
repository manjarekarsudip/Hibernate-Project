package com.velocity.demo2;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate2.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Shop shop = new Shop();
		shop.setDate(new Date());
		shop.setTotal(4000);
		
		Customer customer = new Customer();
		customer.setName("Manjarekar");
		customer.setMobNo(797241);
		
		shop.setCustomer(customer);
		session.save(customer);
		session.save(shop);
		transaction.commit();
		session.close();
	}

}
