package com.bridgelabz.hibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="FourthDto")
public class FourthDTO implements Serializable 
{
	
	 
		
	    @Id
	    @Column(name="p_name")
		private String p_name;
		@Column(name="p_id")
	     private int P_id;
		@Column(name="p_email")
		private String p_email;
		public int getP_id() 
		{
			return P_id;
		}
		public void setP_id(int p_id) 
		{
			P_id = p_id;
		}
		public String getP_name() 
		{
			return p_name;
		}
		public void setP_name(String p_name)
		{
			this.p_name = p_name;
		}
		public String getP_email() 
		{
			return p_email;
		}
		public void setP_email(String p_email)
		{
			this.p_email = p_email;
		}
	
	

}
