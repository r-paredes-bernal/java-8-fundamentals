package java8.session1.inheritance;

import java.util.Date;

/**
 * 
 * @author v.ramos.croda
 * This class is using from electric car.
 */
public class ElectricCar extends Car {

	public ElectricCar(Long id, String name, Integer year, String color, Date date) {
		super(id, name, year, color, date);
		// TODO Auto-generated constructor stub
	}

	/*variable for batteries*/
	public Integer batteries;
	
	/*variable for power*/
	public Integer power;
	
}
