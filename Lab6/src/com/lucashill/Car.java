package com.lucashill;

public class Car {
	private String make, model;
	private int speed;
	
	public void setMake(String make) {this.make = make;}
	public String getMake() {return make;}
	public void setModel(String model) {this.model = model;}
	public String getModel() {return model;}
	public void setSpeed(int speed) {this.speed = speed;}
	public int getSpeed() {return speed;}
	
	public void displayInfo() {
		System.out.println("Car make: " + make + ", model: " + model + ", speed: " + speed);
	}
	
	public static double convertSpeedtoMPH(int speedInKmh) {
		return speedInKmh * 0.621371;
	}
}
