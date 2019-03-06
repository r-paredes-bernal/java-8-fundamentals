package java8.session5.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingCart {

	List<Product> lista = new ArrayList<Product>();
	
	public void add(Product product) {
		lista.add(product);
	}
	
	public int compareTo(Product product) {
		 if (product.getId() < product.getId()) {
            return -1;
        }
		return 0;
	} 
	
	public void print() {
		if(lista.isEmpty()) {
			System.out.print("Lista esta vacia");
		}else {
			Collections.sort(lista);
			for(Product p: lista) {
				System.out.println(p.getId()+ " " +p.getName()+ " " + p.getPrice());
			}
		}
	}
	
}
