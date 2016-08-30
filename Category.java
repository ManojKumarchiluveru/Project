package com.game.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component

public class Category {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cid;
	private String cname;
	private String cdescription;
	
	@ManyToMany
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCdescription() {
		return cdescription;
	}
	public void setCdescription(String cdescription) {
		this.cdescription = cdescription;
	}
	
	
	
	
}
