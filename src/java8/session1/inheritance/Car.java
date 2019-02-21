package java8.session1.inheritance;

import java.util.Date;

public class Car implements Vehicle, FinancialCalculations {
	
	protected long id;
	public String name;
	public Date year;
	public String color;
	
	public Car(long id, String name, Date year, String color){
		this.id = id;
		this.name = name;
		this.year = year;
		this.color = color;
	}
	
	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sppedDown(int decrement) {
		// TODO Auto-generated method stub
		
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getYear() {
		return year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
