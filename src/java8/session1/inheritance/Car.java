package java8.session1.inheritance;

import java.util.Date;

public class Car {
	
	private long id;
	String name;
	int year;
	String color;
	Date date;
	
	public Car(){
		 	
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", year=" + year + ", color=" + color + ", date=" + date + "]";
	}
	

}
