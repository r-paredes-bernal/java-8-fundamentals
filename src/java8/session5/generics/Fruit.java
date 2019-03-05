package java8.session5.generics;

public class Fruit implements Comparable<Fruit>{
	String name = "";
	
	public String getName() {
		return name;
	}
	

	@Override
	public int compareTo(Fruit fruit) {
		return this.name.compareTo(fruit.name);
	}
}
