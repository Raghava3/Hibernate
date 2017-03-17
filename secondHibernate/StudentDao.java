 package com.bar.dao;


import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
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
	
	
	public void listEmployees( ){
		
		Configuration cfg=new Configuration();
		cfg.configure();
	    SessionFactory factory=cfg.buildSessionFactory();
		
	      Session session = factory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         List employees = session.createQuery("FROM Studentdata").list(); 
	         for (Iterator iterator = employees.iterator(); iterator.hasNext();)
	         {
	            Studentdata employee = (Studentdata) iterator.next(); 
	            System.out.print("address: " + employee.getAddress()); 
	            System.out.print("email: " + employee.getEmail()); 
	            System.out.println("name: " + employee.getName()); 
	         }
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	   }
	   /* Method to UPDATE salary for an employee */
	   public void updateEmployee(String  email, String salary ){
		   Configuration cfg=new Configuration();
			cfg.configure();
		    SessionFactory factory=cfg.buildSessionFactory();
			
		      Session session = factory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         Studentdata employee = 
	                    (Studentdata)session.get(Studentdata.class, email); 
	         employee.setName(salary);
			 session.update(employee); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	   }
}
