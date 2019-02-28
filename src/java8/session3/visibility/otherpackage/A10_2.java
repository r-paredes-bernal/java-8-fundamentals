package java8.session3.visibility.otherpackage;

import java8.session3.visibility.A10;

// Sí, los miembros protegidos 
// de una clase se heredan a subclases fuera del paquete.

public class A10_2 extends A10{
	
	public void method(){
   	 System.out.println(a);
    }

}
