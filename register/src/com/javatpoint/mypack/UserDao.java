package com.javatpoint.mypack;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserDao {

	public static Integer register(User u){
      Integer i;
     /*  Configuration cfg=new Configuration();
       cfg.configure();
       SessionFactory Factory=cfg.buildSessionFactory();
      Session session=Factory.openSession();
      Transaction tx=session.beginTransaction();*/
    //  session.save(u);
      
//		Session session=new Configuration().configure().buildSessionFactory().openSession();
	Session session=	new Configuration().configure().buildSessionFactory().getCurrentSession();
		Transaction t=session.beginTransaction();
	//	t.begin();
				
		i=(Integer)session.save(u);
				
		t.commit();
	session.close();
		return i;
	}
}
