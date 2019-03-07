package pas.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SoppingCartt {
	private ArrayList<Product> listProd = new ArrayList<Product>();
	
	public void add(Product prod){		
		listProd.add(prod);
	}
	
	public Comparator<Product> IdComparator = new Comparator<Product>() 
	{
        @Override
        public int compare(Product e1, Product e2) {
            return e1.getId() - e2.getId();
        }
    };

	public Comparator<Product> NameComparator = new Comparator<Product>() 
	{
        @Override
        public int compare(Product e1, Product e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };

    public void imprimir(){
    	Collections.sort(listProd,IdComparator);
    	for(Product prod:listProd){
    		System.out.println("id ="+prod.getId());
    	}
    }
    public void imprimir2(){
    	Collections.sort(listProd,NameComparator);
    	for(Product prod:listProd){
    		System.out.println("id ="+prod.getName());
    	}
    }
    
    
}
