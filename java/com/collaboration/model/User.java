package com.collaboration.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table
@Component
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	
	@NotEmpty(message="username cannot be empty")
	public String username;
	
	@NotEmpty(message="password cannot be empty")
	public String password;
	
	@NotEmpty(message="email cannot be empty")
	public String email;
	
	private String role;
	
	private String location;
	
	private boolean isAdmin;
	
	private String authority;

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	
	
	@Transient
	private String confirmpassword;
	
	
	@Column(name="enabled")
	private boolean isEnabled;
	
	@Transient
	private MultipartFile img;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getConfirmPassword() {
		return confirmpassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		confirmpassword = confirmPassword;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public MultipartFile getImg() {
		return img;
	}

	public void setImg(MultipartFile img) {
		this.img = img;
	}
	
	
	
		
}
