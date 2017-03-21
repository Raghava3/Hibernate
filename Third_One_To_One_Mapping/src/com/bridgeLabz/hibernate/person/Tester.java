package com.bridgeLabz.hibernate.person;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeLabz.hibernate.person.Notebook;


public class Tester {

	public static void main(String[] args)
	{
		
		Configuration 	config=new Configuration();
		config.configure();
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction  tx=session.beginTransaction();	
	Notebook notebook=new Notebook();
	notebook.setBrand("classmate");
	notebook.setPrice(123);
	
	Person person=new Person();
	person.setName("raghav");
	person.setNotbook(notebook);
	 
	session.save(person);
	tx.commit();
	}
	
	
}
