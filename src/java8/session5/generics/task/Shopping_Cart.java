package java8.session5.generics.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;




public class Shopping_Cart  {
	
	ArrayList<Product> list = new ArrayList<Product>();

	public void add(Product product) {
		list.add(product);
	}

	public void print() {
		if ( list.isEmpty() ) {
			System.out.println("The basket is empty");			
		} else {
			
			Collections.sort(list);
			for(Product product: list) {
				System.out.println(product.getId() +" "+product.getName() +" "+ product.getPrice());
				System.out.println( );
				
				
			}
		}
	}

	
}