package pas.generics;

import java.util.Comparator;

public class Product implements Comparable<Product> {

	private int id;
	private String name;
	private double price;
	
	public Product(int id, String name, double price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void calculatePrice(){
		
	}
	@Override
	public int compareTo(Product product) {
		// TODO Auto-generated method stub
		return (this.id-product.id);
	}
	
	public String toString(){
	 return id+" "+name+" "+price;
	}
	
}
