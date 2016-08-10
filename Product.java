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
public class Product {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int pid;

private String pname;

private String pdescription;

public int getId() {
	return pid;
}

public void setId(int id) {
	this.pid = id;
}

public String getName() {
	return pname;
}

public void setName(String name) {
	this.pname = name;
}

public String getDescription() {
	return pdescription;
}

public void setDescription(String description) {
	this.pdescription = description;
}



}
