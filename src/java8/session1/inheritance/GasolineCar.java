package java8.session1.inheritance;

import java.util.Date;

public class GasolineCar extends Car{
	
	public GasolineCar(Long id, String name, Integer year, String color, Date date) {
		super(id, name, year, color, date);
		// TODO Auto-generated constructor stub
	}
	
	public GasolineCar(Long id, String name, Integer year, String color, Date date,Integer gallons,Float mpg) {
		super(id, name, year, color, date);
		this.gallons=gallons;
		this.mpg=mpg;
	}

	public Integer gallons;
	
	public Float mpg;

}
