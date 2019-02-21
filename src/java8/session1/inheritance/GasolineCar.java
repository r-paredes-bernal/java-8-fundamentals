package java8.session1.inheritance;

import java.util.Date;

public class GasolineCar extends Car{
	public int gallons;
	public float mpg;

	public GasolineCar(long id, String name, Date year, String color, int gallons, float mpg) {
		super(id, name, year, color);
		this.gallons = gallons;
		this.mpg = mpg;
	}
	
	public String toString() {
		return "ID: " + id + "\nName: " + this.name + "\nYear: " + this.year + "\nColor: " + this.color + "\nWheels: " + wheels + "\nPassengers: " + passengers + "\nGallons: " + gallons + "\nMPG: " + mpg;		
	}

	public int getGallons() {
		return gallons;
	}

	public void setGallons(int gallons) {
		this.gallons = gallons;
	}

	public float getMpg() {
		return mpg;
	}

	public void setMpg(float mpg) {
		this.mpg = mpg;
	}
	
	

}
