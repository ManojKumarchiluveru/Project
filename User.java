package com.game.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;
@Entity
@Table
@Component
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@NotEmpty(message="empty first name")
	private String ufirstname;
	@NotEmpty(message="empty last name")
	private String ulastname;
	@NotEmpty(message="empty username")
	private String uusername;
	@NotEmpty(message="empty password")
	private String upassword;
	
	@NotEmpty(message="empty password")
	@Transient
	private String cpassword;
	
	
	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

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

	public String getUusername() {
		return uusername;
	}

	public void setUusername(String uusername) {
		this.uusername = uusername;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	@NotEmpty(message="Emailcannot be empty")
	private String uemail;
	
	@Column(name="enabled")
	private boolean isEnabled;
	


}