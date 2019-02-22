package java8.session1.inheritance;

import java.util.Date;

public class Car extends Model implements Vehicle, FinancialCalculations {

	private Long id_car;
	public String nombre;
	public int year;
	public String color;
	public Date date;
	private Engine engine = new Engine();
	
	public Car(Long id_car, String nombre, int year, String color, Date date) {
		super();
		this.id_car = id_car;
		this.nombre = nombre;
		this.year = year;
		this.color = color;
		this.date = date;
	}

	public void addModel (Model model) {
		System.out.print("Nuevo model");
	}
	
	public Long getId_Car() {
		return id_car;
	}

	public void setId_Car(Long id_car) {
		this.id_car = id_car;
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
		return "Car [id_car=" + id_car + ", nombre=" + nombre + ", year=" + year + ", color=" + color + ", date=" + date
				+ ", engine=" + engine + "]";
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

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}	

	
}
