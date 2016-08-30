package com.game.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table
@Component

public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	private String pname;
	private String pdescription;
	@Min(1)
	private int pprice;
	@Min(1)
	private int pquantity;
	
	@Transient
	private MultipartFile img;
	
	public MultipartFile getImg() {
		return img;
	}
	public void setImg(MultipartFile img) {
		this.img = img;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdescription() {
		return pdescription;
	}
	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	public int getPquantity() {
		return pquantity;
	}
	public void setPquantity(int pquantity) {
		this.pquantity = pquantity;
	}

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="supplier_id",insertable=false,updatable=false)
	private Supplier supplier;


	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	
	private int supplier_id;


	public int getSupplier_id() {
		return supplier_id;
	}
	public void setSup_spid(int supplier_id) {
		this.supplier_id = supplier_id;
	}




	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="category_id",nullable=false,insertable=false,updatable=false)
	private Category category;


	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	private int category_id;


	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}


}
