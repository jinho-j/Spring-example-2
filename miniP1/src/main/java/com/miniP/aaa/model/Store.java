package com.miniP.aaa.model;

public class Store {
	private int number;
	private String storeName;
	private String location;
	private String food_type;
	private double grade_taste;
	private double grade_price;
	private double grade_clean;
	private double grade_service;
	private String event;
	


	public Store() {
		// TODO Auto-generated constructor stub
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getFood_type() {
		return food_type;
	}
	public void setFood_type(String food_type) {
		this.food_type = food_type;
	}
	public double getGrade_taste() {
		return grade_taste;
	}
	public void setGrade_taste(double grade_taste) {
		this.grade_taste = grade_taste;
	}
	public double getGrade_price() {
		return grade_price;
	}
	public void setGrade_price(double grade_price) {
		this.grade_price = grade_price;
	}
	public double getGrade_clean() {
		return grade_clean;
	}
	public void setGrade_clean(double grade_clean) {
		this.grade_clean = grade_clean;
	}
	public double getGrade_service() {
		return grade_service;
	}
	public void setGrade_service(double grade_service) {
		this.grade_service = grade_service;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	@Override
	public String toString() {
		return "store [number=" + number + ", storeName=" + storeName + ", location=" + location + ", food_type="
				+ food_type + ", grade_taste=" + grade_taste + ", grade_price=" + grade_price + ", grade_clean="
				+ grade_clean + ", grade_service=" + grade_service + ", event=" + event + "]";
	}
	

}
