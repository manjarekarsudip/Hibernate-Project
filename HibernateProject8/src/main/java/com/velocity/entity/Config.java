package com.velocity.entity;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class Config {

	public static SessionFactory getSessionFactory(){
	Configuration configuration = new Configuration();
	
	Properties settings = new Properties();
	
	settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
	settings.put(Environment.URL, "jdbc:mysql://localhost:3306/test");
	settings.put(Environment.USER, "root");
	settings.put(Environment.PASS, "root");
	settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
	settings.put(Environment.SHOW_SQL, "true");
	settings.put(Environment.HBM2DDL_AUTO, "update");
	settings.put(Environment.FORMAT_SQL, "true");
	
	configuration.setProperties(settings);
	configuration.addPackage("com.velocity.entity");
	configuration.addAnnotatedClass(Employee.class);
	configuration.addAnnotatedClass(Project.class);
	
	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
			.applySettings(configuration.getProperties()).build();
	SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);
	return factory;
	}
}
