package com.sks.model;

public class Student {
	
	private int id;
	private String name;
	private String surName;
	
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
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surName=" + surName + "]";
	}
	
	

}
