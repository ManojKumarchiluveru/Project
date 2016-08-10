package com.game.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Table
@Component
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
private String ufirstname;
private String ulastname;
private boolean isAdmin;
private String uemail;
private String upassword;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return ufirstname;
}
public void setFirstname(String firstname) {
	this.ufirstname = firstname;
}
public String getLastname() {
	return ulastname;
}
public void setLastname(String lastname) {
	this.ulastname = lastname;
}
public boolean isAdmin() {
	return isAdmin;
}
public void setAdmin(boolean isAdmin) {
	this.isAdmin = isAdmin;
}
public String getEmail() {
	return uemail;
}
public void setEmail(String email) {
	uemail = email;
}
public String getPassword() {
	return upassword;
}
public void setPassword(String password) {
	this.upassword = password;
}



}
