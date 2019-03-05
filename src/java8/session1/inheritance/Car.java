package java8.session1.inheritance;

import java.util.Date;

public class Car implements Vehicle,FinancialCalculations{
	
	private long id;
	public String name;
	public int year;
	public String color;
	public Date date;
	private Engine Engine;
	
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
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", year=" + year + ", color=" + color + ", date=" + date + "]";
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
	public void speedUp(int a) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void speedDown(int b) {
		// TODO Auto-generated method stub
		
	}
	
	Model model = new Model();
	
	
	

}
