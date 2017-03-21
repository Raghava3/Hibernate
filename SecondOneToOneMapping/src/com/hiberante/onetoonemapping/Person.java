package com.hiberante.onetoonemapping;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.annotations.GenericGenerator;



@Entity

public class Person implements Serializable
{ 
	@Id
	@GeneratedValue(generator="abc")
	@GenericGenerator(name="abc",strategy="increment")

	private int id;
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	PersonDetil personDetil;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PersonDetil getPersonDetil() {
		return personDetil;
	}
	public void setPersonDetil(PersonDetil personDetil) {
		this.personDetil = personDetil;
	}
	
	

}
