package java8.session5.generics.practice;

import java.util.ArrayList;
import java.util.Collections;
import java8.session5.generics.Printable;

public class ShoppingCar implements Printable {
	ArrayList<Product> list = new ArrayList<Product>();

	public void add(Product product) {
		list.add(product);
	}

	@Override
	public void print() {

		System.out.println("The ShoppingCar contains: ");
		Collections.sort(list);
		for (Product product : list) {
			System.out.println(product);
		}

	}

}
