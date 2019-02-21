package java8.session1.inheritance;

import java.util.Date;

public class ElectricCar extends Car {
	public int batteries;
	public int power;

	public ElectricCar(long id, String name, Date year, String color, int batteries, int power) {
		super(id, name, year, color);
		this.batteries = batteries;
		this.power = power;
	}
	
	
	@Override
	public String toString() {
		return "ID: " + id + "\nName: " + this.name + "\nYear: " + this.year + "\nColor: " + this.color + "\nWheels: " + wheels + "\nPassengers: " + passengers + "\nBaterries: " + batteries + "\nPower: " + power;		
	}


	public int getBatteries() {
		return batteries;
	}


	public void setBatteries(int batteries) {
		this.batteries = batteries;
	}


	public int getPower() {
		return power;
	}


	public void setPower(int power) {
		this.power = power;
	}
	
	

}
