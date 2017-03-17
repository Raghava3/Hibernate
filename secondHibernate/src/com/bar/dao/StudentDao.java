 package com.bar.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bar.dto.Studentdata;

public class StudentDao {
	
	public void add(Studentdata st)
	{
		Configuration cfg=new Configuration();
		cfg.configure();
	    SessionFactory factory=cfg.buildSessionFactory();
	    Session session =factory.openSession();
		Transaction tx=session.beginTransaction();

	session.save(st);
	tx.commit();
	}
  
}
