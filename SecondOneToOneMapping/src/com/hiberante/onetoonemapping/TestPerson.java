package com.hiberante.onetoonemapping;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestPerson {

	public static void main(String[] args) {
	Configuration 	config=new Configuration();
	config.configure();
	SessionFactory factory=config.buildSessionFactory();
	Session session=factory.openSession();
	Transaction  tx=session.beginTransaction();
	
		PersonDetil alexDetail= new PersonDetil();
		alexDetail.setAddress("New Zeland");
		alexDetail.setAge(28);
		alexDetail.setSalary(4755664);
		
       Person alex=new Person();
     alex.setName("Alex Jacob");
     alex.setPersonDetil(alexDetail);
      
    
       
       session.save(alex); 
       //no need if we set cascade type
       //session.save(alexDetail);
       tx.commit();
       
	}
	
}
