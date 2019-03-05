package java8.session1.inheritance;

import java.time.LocalDate;
import java.util.Date;

public class ElectricCar extends Car{

	public int batteries;
	public int power;
	public ElectricCar(long id, String name, int year, String color, Date date,int batteries,int power) {
		super();
		this.batteries=batteries;
		this.power=power;
	}
}
