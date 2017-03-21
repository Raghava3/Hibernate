package com.Bridgelabz;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Bridgelabz.CRUDDTO;

public class CRUDDAO {
	
	public void add(CRUDDTO dt)
	{
	Session session=new Configuration().configure().buildSessionFactory().openSession();
	Transaction tx=session.beginTransaction(); 
     session.save(dt);
    //int n=i.intValue();
    tx.commit();
    session.close();
    //return n;
	}
	
	
	public CRUDDTO  retriveByPrimaryKey(String p_name)
	{
	Session session=new Configuration().configure().buildSessionFactory().openSession();
	Transaction tx=session.beginTransaction(); 
    CRUDDTO dt=session.get(CRUDDTO.class, p_name); 
     tx.commit();
    session.close();
    return dt;
	}
	
	public void update(String pk_name, String updatename)
	{
		System.out.println(pk_name);
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
	    CRUDDTO dt=session.get(CRUDDTO.class, pk_name); 
	    dt.setP_email(updatename);
	    System.out.println("updatename"+updatename);
	   
	    session.update(dt);
	    tx.commit();
	    session.close();
	   
	 
	}
	
	
public void list( )
{
		
		Configuration cfg=new Configuration();
		cfg.configure();
	    SessionFactory factory=cfg.buildSessionFactory();
		
	      Session session = factory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         //creating the query on student data and adding to list 
 	         List employees = session.createQuery("from CRUDDTO").list();
 	         //using the for loop i am checking for next element exist or not 
	         for (Iterator iterator = employees.iterator(); iterator.hasNext();)
	         {
	        	 //getting the element and printing 
	        	 CRUDDTO employee = (CRUDDTO) iterator.next(); 
	            System.out.println("mail" + employee.getP_email()); 
	            System.out.println("id:" + employee.getP_id()); 
	            System.out.println("name:" + employee.getP_name()); 
	         }
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	         factory.close();
	      }
	   }

	
	public void delete(String pk)
	{
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		session.delete(session.get(CRUDDTO.class, pk));
     	tx.commit();
		
	}

}
