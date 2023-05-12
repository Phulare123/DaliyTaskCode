package com.cg.map.linedHashMap;

public class Car {
	
	private String carId;
	private double carPrice;
	private String carName;
	
	
	
	
	public Car(String carId, double carPrice, String carName) {
		super();
		this.carId = carId;
		this.carPrice = carPrice;
		this.carName = carName;
	}
	
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	

}
