package com.game.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component

public class Supplier {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int supid;
	private String supname;
	private String supaddress;
	private String supmobile;
	
	
	public int getSupid() {
		return supid;
	}
	public void setSupid(int supid) {
		this.supid = supid;
	}
	
	public String getSupname() {
		return supname;
	}
	public void setSupname(String supname) {
		this.supname = supname;
	}
	public String getSupaddress() {
		return supaddress;
	}
	public void setSupaddress(String supaddress) {
		this.supaddress = supaddress;
	}
	public String getSupmobile() {
		return supmobile;
	}
	public void setSupmobile(String supmobile) {
		this.supmobile = supmobile;
	}
		
}
