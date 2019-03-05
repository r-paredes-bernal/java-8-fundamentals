package java8.session5.generics.practice;

public class MainClass {
	public static void main(String args[]) {
	ShoppingCar shoppingCar = new ShoppingCar();
	Product product1 = new Product(1001,"Computadora",18500d);
	Product product2 = new Product(3004,"Pantalla",9000d);
	Product product3 = new Product(2101,"Mouse",800d);

	shoppingCar.add(product1);
	shoppingCar.add(product2);
	shoppingCar.add(product3);
	
	shoppingCar.print();

	}
}
