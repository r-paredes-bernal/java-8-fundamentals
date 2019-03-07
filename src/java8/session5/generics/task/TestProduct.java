package java8.session5.generics.task;

import java.util.Collection;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product n = new Product(1001, "Computadora", 18.500);
		Product n1 = new Product(3004, "Pantalla", 19.00);
		Product n2 = new Product(2101, "Mouse", 800);

		
		Shopping_Cart produ = new Shopping_Cart();
		
		
		
	produ.add(n);
	produ.add(n1);
	produ.add(n2);

		produ.print();
		
n.toString();
	}

}
