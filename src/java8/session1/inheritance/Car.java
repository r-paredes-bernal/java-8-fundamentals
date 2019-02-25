package java8.session1.inheritance;

import java.util.Date;

public class Car {
	
	private long id;
	public String name;
	public int year;
	public String color;
	public Date date;
	private Engine engine;
	

	public Car(long id, String name, int year, String color, Date date) {
		//super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.color = color;
		this.date = date;
	}
	
	
	public void addModel(Model model) {
		
	}
	
	public String toString() {
		return "Car [id=" + id + ", name= " + name + ", year= " + year + ", color= " + color + ", date= " + date + "]";
	}
	
	
	
}
