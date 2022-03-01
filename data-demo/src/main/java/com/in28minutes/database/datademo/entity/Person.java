package com.in28minutes.database.datademo.entity;

import java.util.Date;

public class Person {
 public Person(int id, String name, String loaction, Date birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.loaction = loaction;
		this.birthdate = birthdate;
	}
 

private int id;
 private String name;
 private String loaction;
 private Date birthdate;
 public Person() {
	 	
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
public String getLoaction() {
	return loaction;
}
public void setLoaction(String loaction) {
	this.loaction = loaction;
}
public Date getBirthdate() {
	return birthdate;
}
public void setBirthdate(Date birthdate) {
	this.birthdate = birthdate;
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", loaction=" + loaction + ", birthdate=" + birthdate + "]";
}
}
