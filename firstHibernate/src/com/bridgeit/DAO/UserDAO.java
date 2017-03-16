package com.bridgeit.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeit.DTO.User;
public class UserDAO {
	public void saveUser(User user)
	{
		
		Configuration cfg=new  Configuration();
		cfg.configure();
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session =factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(user);
		tx.commit();
		
	}
}
