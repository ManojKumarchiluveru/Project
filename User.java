package com.game.model;

import javax.persistence.Column;
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
@Column(name="Enabled")
private boolean isenabled;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUfirstname() {
	return ufirstname;
}
public void setUfirstname(String ufirstname) {
	this.ufirstname = ufirstname;
}
public String getUlastname() {
	return ulastname;
}
public void setUlastname(String ulastname) {
	this.ulastname = ulastname;
}
public boolean isAdmin() {
	return isAdmin;
}
public void setAdmin(boolean isAdmin) {
	this.isAdmin = isAdmin;
}
public String getUemail() {
	return uemail;
}
public void setUemail(String uemail) {
	this.uemail = uemail;
}
public String getUpassword() {
	return upassword;
}
public void setUpassword(String upassword) {
	this.upassword = upassword;
}
public boolean isIsenabled() {
	return isenabled;
}
public void setIsenabled(boolean isenabled) {
	this.isenabled = isenabled;
}


}
