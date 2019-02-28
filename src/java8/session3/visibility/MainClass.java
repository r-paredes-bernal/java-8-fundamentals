package java8.session3.visibility;

public class MainClass {
	  public static void main(String[] args)
	    {
		  
	 //       C.methodOfC();//invocamos a la clase C --> ejercicio 14
	        
	       // B5 b = new B5();//Ejercicio 5-->no se puede acceder a la clase interna B5 es privada

	        
	        A8 a8 = new A8();
	         
	        System.out.println(a8.i);
	         
	        a8.methodOfX();
	    }
}
