package com.bar.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bar.DTO.Jsonmembers;

public class Dataaccessobject 
{

	public void saveUser(Jsonmembers jm)
	{
		
		Configuration cfg=new  Configuration();
		cfg.configure();
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session =factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(jm);
		tx.commit();
		
	}
}
