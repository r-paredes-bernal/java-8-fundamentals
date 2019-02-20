package java8.session1.inheritance;

import java.util.Date;

public class GasolineCar extends Car{
	
	public int gallons;
	public float mpg;
	
	public GasolineCar(Long id, String nombre, int year, String color, Date date,int gallons, float mpg) {
		super(id, nombre, year, color, date);
		this.gallons = gallons;
		this.mpg = mpg;
		
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
