package com.hiberante.onetoonemapping;

import java.io.Serializable;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


import org.hibernate.annotations.GenericGenerator;

@Entity
public class PersonDetil  implements Serializable
{ 
	@Id
	@GeneratedValue(generator="abc")
	@GenericGenerator(name="abc",strategy="increment")
	private int id;
	private String address;
	private double salary;
	private int age;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private Person person;
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public PersonDetil() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
