package com.bar;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DAO 

{
	
	public int  add(DTO dt)
	{
	Session session=new Configuration().configure().buildSessionFactory().openSession();
	Transaction tx=session.beginTransaction(); 
    Integer i=(Integer)session.save(dt);
    int n=i.intValue();
    tx.commit();
 
    session.close();
    return n;
	}
	
	public DTO  fetchbyid(int P_id)
	{
	Session session=new Configuration().configure().buildSessionFactory().openSession();
	Transaction tx=session.beginTransaction(); 
  
  
  
   DTO dt= session.get(DTO.class, P_id); 
		   
    session.close();
    return dt;
	}
	
	

}
