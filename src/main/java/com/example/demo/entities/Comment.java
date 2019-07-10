package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comment implements Serializable {
	
	@Id
	@GeneratedValue
	private int id ;
	private String cmtr;
	
	@ManyToOne
	private User user ;

	@ManyToOne
	private Post post;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getCmtr() {
	return cmtr;
}
public void setCmtr(String cmtr) {
	this.cmtr = cmtr;
}




}
