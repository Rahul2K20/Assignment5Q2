package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class MainCreateProduct {
public static void main(String[] args) 
		 {
		  //Create product entity object
		  Product product = new Product();
		  product.setId(1);
		  product.setName("Playstation");
		  
		  //Create session factory object
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  //getting session object from session factory
		  Session session = sessionFactory.openSession();
		  //getting transaction object from session object
		  session.beginTransaction();
		  
		  session.save(product);
		  System.out.println("Inserted Successfully");
		  session.getTransaction().commit();
		  session.close();
		  sessionFactory.close();
		 }

}
