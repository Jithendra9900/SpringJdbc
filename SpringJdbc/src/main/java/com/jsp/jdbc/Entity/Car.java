package com.jsp.jdbc.Entity;

public class Car {
	private String carNo;
	private String carName;
	private double mileage;
	private double price;
	private String carcolor;
	public Car() {
		
	}
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String no) {
		this.carNo = no;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCarcolor() {
		return carcolor;
	}
	public void setCarcolor(String carcolor) {
		this.carcolor = carcolor;
	}
	@Override
	public String toString() {
		return "Car [carNo=" + carNo + ", carName=" + carName + ", mileage=" + mileage + ", price=" + price
				+ ", carcolor=" + carcolor + "]";
	}
	
	

}
