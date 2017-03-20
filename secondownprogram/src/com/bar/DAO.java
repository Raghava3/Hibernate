package com.bar;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DAO 
{
	
	public void add(DTO d)
	{
	Session session=new Configuration().configure("hiber.cfg.xml").buildSessionFactory().openSession();
	Transaction tx= session.beginTransaction();
	session.save(d);
	tx.commit();
	
	session.close();
    
	}

}
