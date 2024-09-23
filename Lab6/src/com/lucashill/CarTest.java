package com.lucashill;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car(), car2 = new Car();
		car1.setMake("Toyota");
		car1.setModel("Corolla");
		car1.setSpeed(180);
		car2.setMake("Honda");
		car2.setModel("Civic");
		car2.setSpeed(200);
		car1.displayInfo();
		car2.displayInfo();
		car1.setSpeed((int) Car.convertSpeedtoMPH(car1.getSpeed()));
		car2.setSpeed((int) Car.convertSpeedtoMPH(car2.getSpeed()));
		car1.displayInfo();
		car2.displayInfo();

		
	}

}
