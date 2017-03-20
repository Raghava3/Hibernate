package com.bridgelabz.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FourthDAO 
{
	
	public void  add(FourthDTO dt)
	{
	Session session=new Configuration().configure().buildSessionFactory().openSession();
	Transaction tx=session.beginTransaction(); 
     session.save(dt);
    //int n=i.intValue();
    tx.commit();
    session.close();
    //return n;
	}
	
	
	public FourthDTO  fetchbyName(String p_name)
	{
	Session session=new Configuration().configure().buildSessionFactory().openSession();
	Transaction tx=session.beginTransaction(); 
    FourthDTO dt=session.get(FourthDTO.class, p_name); 
    session.close();
    return dt;
	}
	
}
