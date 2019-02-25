package java8.session1.inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java8.session1.inheritance.interfaces.FinancialCalculations;
import java8.session1.inheritance.interfaces.Vehicle;

public class Car implements Vehicle, FinancialCalculations{

	private Long id;
	public String name;
	public Integer year;
	public String color;
	public Date date;
	private Engine engine;
	
	public void addModel (Model model) {
	}

	
    public Car(Long id, String name, Integer year, String color, Date date){
	       this.id = id;
	       this.name = name;
	       this.year = year;
	       this.color = color;
	       this.date = date;
	    }
	
    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", date=" + date +
                '}';
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
	public void speedUP(Integer up) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speedDown(Integer down) {
		// TODO Auto-generated method stub
		
	}
  
}
