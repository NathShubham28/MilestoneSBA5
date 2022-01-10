package com.assessment.SpringRestApi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name,gender,preferredFood;
	private int age;
	
	public Customer() {
		
	}
	
	public Customer(String name, String gender, String preferredFood, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.preferredFood = preferredFood;
		this.age = age;
	}
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPreferredFood() {
		return preferredFood;
	}
	public void setPreferredFood(String preferredFood) {
		this.preferredFood = preferredFood;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
