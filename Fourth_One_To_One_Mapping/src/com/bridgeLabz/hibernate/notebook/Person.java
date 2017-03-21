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

import com.bridgeLabz.hibernate.notebook.Notebook;
@Entity
@Table
public class Person implements Serializable
{
	  @Id
	  @GeneratedValue(generator="abc")
	  @GenericGenerator(name="abc",strategy="increment")
		private int id;
		private String name;
	 @OneToOne(cascade=CascadeType.ALL)
	 @PrimaryKeyJoinColumn
	private Notebook notbook;
	public int getId()
	{
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public Notebook getNotbook()
	{
		return notbook;
	}
	public void setNotbook(Notebook notbook)
	{
		this.notbook = notbook;
	}
}
