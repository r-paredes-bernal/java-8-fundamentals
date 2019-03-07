package pas.generics.generic;

import java.util.ArrayList;
import java.util.List;
import pas.generics.Product;

public class Generic{
	
	public static void main(String[] args)
	{
		Generico<Integer> genInt = new Generico<Integer>();
		genInt.add(112);
		genInt.add(7890);
		
		//List<Integer> listInteger = listInteger=genInt.getList();
		
		System.out.println("Lista de Enteros");
		
		for(Integer inte: genInt.getList()){
		 System.out.println("Valor Entero ="+inte);	
		}
		
		System.out.println("Lista de Strings");
		
		Generico<String> genStr = new Generico<String>();
		genStr.add("Historia");
		genStr.add("Geografia");
		
		for(String str:genStr.getList()){
			System.out.println("Valor del setring ="+str);
		}
		
		System.out.println("Lista de productos");
		
		Generico<Product> genProd = new Generico<Product>();
		genProd.add(new Product(1,"Oro",3453.28));
		genProd.add(new Product(2,"Plata",1345.78));
		
		for(Product prod:genProd.getList()){
			System.out.println("Producto "+prod.getId()+" "+prod.getName()+ " "+prod.getPrice() );
		}
		
	}
}

class Generico<T> {
    
	private List<T> values= new ArrayList<T>();

    void add(T value) {
        values.add(value);
    }

    void remove(T value) {
        values.remove(value);
    }

    T get(int index) {
        return values.get(index);
    }
    
    List<T> getList(){
    	return values;
    }
}


