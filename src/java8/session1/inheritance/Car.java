package Java8.Session1.Inheritance;

import java.util.Date;

public class Car implements Vehicle, FinancialCalculation{

	public Car(long id, String name,int year, String color, Date date){
		this.id=id;
		this.name=name;
		this.year=year;
		this.color=color;
		this.date=date;
	}
	
	public Car(){}
	
	private long id;
	public String name;
	public int year;
	public String color;
	public Date date;
	
	//sobreescribe el metodo toString() de la clase Object
	public String toString(){
		return "id="+id+" name = "+name+" year ="+year+" color="+color+" date="+date;
	}

	@Override
	public void speedDown(int velosity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speedUp(int velosity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public double calculataCost() {
		// TODO Auto-generated method stub
		return cost;
	}
}
