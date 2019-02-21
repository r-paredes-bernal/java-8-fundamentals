package java8.session1.inheritance;

import java.time.LocalDate;

public class ElectricCar extends Car {
	public int batteries;
	public int power;
	public ElectricCar(long id, String name, int year, String color, LocalDate date,int batteries,int power) {
		super(id, name, year, color, date);
		this.batteries=batteries;
		this.power=power;
	}
	// se sobreescribe el metodo toString
	@Override
	public String toString() {
		return "ElectricCar [batteries=" + batteries + ", power=" + power + ", name=" + name + ", year=" + year
				+ ", color=" + color + ", date=" + date +", wheels= "+wheels+ ", passengers= "+passengers+ "]";
	}
	
}
