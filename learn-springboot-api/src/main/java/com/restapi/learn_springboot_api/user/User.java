package com.restapi.learn_springboot_api.user;

import java.time.LocalDate;

import jakarta.validation.constraints.Size;

public class User {
	private Integer id;
	
	@Size(min = 2,message = "Name should have at least 2 charectors")
	private String name;
	private LocalDate birthLocalDate;
	
	public User(Integer id, String name, LocalDate birthLocalDate) {
		this.id = id;
		this.name = name;
		this.birthLocalDate = birthLocalDate;
	}

	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public LocalDate getBirthLocalDate() {
		return birthLocalDate;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) { 
		this.name = name;
	}
	public void setBirthLocalDate(LocalDate birthLocalDate) {
		this.birthLocalDate = birthLocalDate;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthLocalDate=" + birthLocalDate + "]";
	}
	
}
