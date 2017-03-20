package com.Bridgelabz;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class FifthDAO
{
	
	public String add(FifthDTO dt)
	{
	Session session=new Configuration().configure().buildSessionFactory().openSession();
	Transaction tx=session.beginTransaction(); 
    String s= (String)session.save(dt);
   
    tx.commit();
    session.close();
    return s;
	}
	
	public FifthDTO  fetchbyName(String p_name)
	{
	Session session=new Configuration().configure().buildSessionFactory().openSession();
	Transaction tx=session.beginTransaction(); 
   FifthDTO dt=(FifthDTO)session.get(FifthDTO.class, p_name);
    session.close();
    return dt;
	}

}
