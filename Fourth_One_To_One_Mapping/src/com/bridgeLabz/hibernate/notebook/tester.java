package com.bridgeLabz.hibernate.notebook;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.bridgeLabz.hibernate.notebook.Notebook;
import com.bridgeLabz.hibernate.notebook.Person;

public class tester 
{
	public static void main(String[] args)
	{
		Configuration 	config=new Configuration();
		config.configure();
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction  tx=session.beginTransaction();	
	    Person person=new Person();
	    person.setName("raghava");
	    Notebook notebook=new Notebook();
	    notebook.setBrand("classmate");
	    notebook.setPrice(50);
	    notebook.setPerson(person);
	 //   System.out.println(notebook);
	  session.save(notebook);
	    tx.commit();
	}
	
	
}
