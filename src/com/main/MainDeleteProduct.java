package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class MainDeleteProduct {
		
		public static void main(String[] args) 
		 {
		 //Create session factory object
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		//getting session object from session factory
		Session session = sessionFactory.openSession();
		//getting transaction object from session object
		session.beginTransaction();
		Product product = (Product)session.load(Product.class, 1);
		session.delete(product);
		System.out.println("Deleted Successfully");
		session.getTransaction().commit();
		sessionFactory.close();
		 }
}
