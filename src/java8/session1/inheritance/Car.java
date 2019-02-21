package java8.session1.inheritance;

import java.util.Date;
/**
 * 
 * @author v.ramos.croda
 *
 */
public class Car implements Vehicle,FinancialCalculations{
	
	/*id value from car*/
	private Long id;
	
	/*nam from car*/
	public String name;
	
	/*model year from car*/
	public Integer year;
	
	/*color from car*/
	public String color;
	
	/*date from car*/
	public Date date;
	
	/**
	 * Constructor using all variables.
	 * @param id
	 * @param name
	 * @param year
	 * @param color
	 * @param date
	 */
	public Car(Long id,String name,Integer year,String color,Date date) {
		this.id=id;
		this.name=name;
		this.year=year;
		this.color=color;
		this.date=date;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * to String method using to view all values of the variables.
	 */
	public String toString() {
		return " id: "+id+"\n name: "+name+"\n year: "+year+"\n color: "+color+"\n date: "+date;
	}


	@Override
	public Double calculatePrice() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Double calculateCost() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void speedUp(Integer value) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void speedDown(Integer value) {
		// TODO Auto-generated method stub
		
	}
}
