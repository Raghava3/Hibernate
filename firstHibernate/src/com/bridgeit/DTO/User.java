package com.bridgeit.DTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="User_Table")
public class User implements Serializable {

	@Id
	@Column(name="ID")
 int id;
	@Column(name="USER_NAME")
 String name;
	@Column(name="USER_AGE")
 int age;
	
	
 public User() {
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
	
}
