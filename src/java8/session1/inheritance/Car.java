package java8.session1.inheritance;

import java.util.Date;

public class Car implements Vehicle, FinancialCalculations {

	private Long id;
	public String nombre;
	public int year;
	public String color;
	public Date date;

	public Car(Long id, String nombre, int year, String color, Date date) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.year = year;
		this.color = color;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		return "Car [id=" + id + ", nombre=" + nombre + ", year=" + year + ", color=" + color + ", date=" + date + "]";
	}

	@Override
	public void speedUp(int x) {
		System.out.print("Calculatig speedUp ... ");
	}

	@Override
	public void speedDown(int y) {
		System.out.print("Calculatig speedDown ... ");
	}

	@Override
	public double calculatePrice() {
		return price;
	}

	@Override
	public double calculateCost() {
		return cost;
	}

}
