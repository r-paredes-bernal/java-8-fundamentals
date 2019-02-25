package java8.session1.inheritance;

import java.util.Date;

public class ElectricCar extends Car{
	
	public Integer batteries;
	
	public Integer power;
	
	public ElectricCar(Long id, String name, Integer year, String color, Date date) {
		super(id, name, year, color, date);
	}

}
