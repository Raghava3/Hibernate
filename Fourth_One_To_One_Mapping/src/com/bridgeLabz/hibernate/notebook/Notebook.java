package com.bridgeLabz.hibernate.notebook;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table
public class Notebook implements Serializable
{
	
	@Id
	@GeneratedValue(generator="abc")
	@GenericGenerator(name="abc",strategy="increment")
    private int id;
	private String Brand;
	private double price;
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Person person;

	public Notebook()
	{
		
	}
		public int getId()
		{
		return id;
	   }
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getBrand() 
	{
		return Brand;
	}
	public void setBrand(String brand) 
	{
		Brand = brand;
	}
	public double getPrice() 
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
