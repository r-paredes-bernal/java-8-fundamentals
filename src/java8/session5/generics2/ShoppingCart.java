package java8.session5.generics2;

import java.util.ArrayList;
import java.util.Collections;



public class ShoppingCart implements Print {
	ArrayList<Product> list = new ArrayList<Product>();
	public void add(Product product) {
		list.add(product);
	}

	@Override
	public void print() {
		if(list.isEmpty()) {
			System.out.println("lista esta vacia");
		}else {
			Collections.sort(list);
			for(Product p: list) {
				System.out.println(p.getId()+ " " +p.getName()+ " " + p.getPrice());
			}
		}
	}
}
