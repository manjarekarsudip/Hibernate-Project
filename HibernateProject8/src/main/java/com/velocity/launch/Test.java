package com.velocity.launch;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.velocity.entity.Employee;
import com.velocity.entity.Project;

public class Test {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setName("Sudip");
		Employee e2 = new Employee();
		e2.setName("Scott");
		
		Project p1 = new Project();
		p1.setName("Customer Service");
		Project p2 = new Project();
		p2.setName("Business Devp Service");
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		
		List<Project> projList = new ArrayList<Project>();
		projList.add(p1);
		projList.add(p2);
		
		e1.setProjects(projList);
		p2.setEmployees(empList);
		
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		
		transaction.commit();
		session.close();
	}

}
