package com.bridgeLabz.hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MobileDAO 
{
	public MobileDAO() {
		System.out.println(this.getClass().getSimpleName()+"Created...");
	}
	
	public void saveMobile(Mobile m)
	{
		System.out.println("data saving ");
		
	Session session =new Configuration().configure().buildSessionFactory().openSession();
	Transaction tx=session.beginTransaction();
	
		try{
			session.save(m);
			tx.commit();
		}catch (Exception e) 
		{
			e.printStackTrace();
			tx.rollback();
		}
		finally {
			session.close();
		}
	}
}