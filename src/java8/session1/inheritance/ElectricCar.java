package java8.session1.inheritance;

import java.util.Date;

public class ElectricCar extends Car {

	public int batteries;
	public int power;
	
	public ElectricCar(Long id, String nombre, int year, String color, Date date, int batteries, int power) {
		super(id, nombre, year, color, date);
		this.batteries = batteries;
		this.power = power;
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
