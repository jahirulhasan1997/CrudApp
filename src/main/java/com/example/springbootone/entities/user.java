package com.example.springbootone.entities;

import javax.persistence.*;
import javax.persistence.Id;

@Entity
public class user {
	
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 
 private int id ;
 private String name;
 private String city;
 private String email;
 
public user(int id, String name, String city, String email) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	this.email = email;
}
public user() {
	super();
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
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

 
}
