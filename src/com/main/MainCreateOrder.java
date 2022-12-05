package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class MainCreateOrder {
	
	 public static void main(String[] args) 
	 {
	  //Create order entity object
	  Order order = new Order();
	  order.setId(1);
	  order.setName("Electronics");
	  
	  //Create session factory object
	  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	  //getting session object from session factory
	  Session session = sessionFactory.openSession();
	  //getting transaction object from session object
	  session.beginTransaction();
	  
	  session.save(order);
	  System.out.println("Inserted Successfully");
	  session.getTransaction().commit();
	  session.close();
	  sessionFactory.close();
	 }
}
