package com.java.webSpringApplication.DAO;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateCheck {
	public static Session session;

	public static void main(String[] args) {
		Date date=new Date();
		
		 session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();

		Customers customers=new Customers();
		//customers.setCust_id(1);
		customers.setCreated(date);
		customers.setModified(date);
		customers.setName("Balasubramanyam Lanka");
		customers.setFirst_Name("balasubramanyam");
		customers.setLast_Name("Lanka");
		customers.setState("Active");
		customers.setEmail("balasubramanyam.lanka@gmail.com");
		customers.setBilling_Address_Line1("15256 Stonebriar way");
		customers.setBilling_City("Orlando");
		customers.setBilling_State("FLorida");
		customers.setBilling_Country("USA");
		session.save(customers);
		session.persist(customers);
		session.save(customers);
		transaction.commit();
		session.close();
		
		System.out.println("user saved successfully");

	}

}
