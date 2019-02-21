package java8.session1.inheritance;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

/* Open the image file img/Java8-Session1-Class Diagram.jpg and create 
 * the objects and interfaces required.
 * 
 * 1.- Create a constructor in Car that receives all the arguments to initialize them  
 * 2.- Create toString Method to display all the attributes
 * 3.- Create an instance of car and use the constructor in number 1 to initialize the attributes
 * 4.- Call the toString method and run the class to see the output 
 * 
 * Note: Fix the issues if there is any 
 * 
 */
public class TestCar {

	public static void main(String[] args) throws java.text.ParseException {

		Date date = new Date();
		
		List<Car> c = new LinkedList<Car>();
		
		Car car = new Car(11L, "nombre", 1991, "rojo", date);
		Car car2 = new Car(22L, "nombre2", 1992, "azul", date);
		Car car3 = new Car(33L, "nombre3", 1993, "morado", date);
		Car car4 = new Car(44L, "nombre4", 1994, "negro", date);
		Car car5 = new Car(55L, "nombre5", 1995, "blanco", date);
		Car car6 = new Car(66L, "nombre6", 1996, "azul", date);
		Car car7 = new Car(77L, "nombre7", 1997, "amarillo", date);
		Car car8 = new Car(88L, "nombre8", 1998, "rojo", date);
		
		c.add(car);
		c.add(car2);
		c.add(car3);
		c.add(car4);
		c.add(car5);
		c.add(car6);
		c.add(car7);
		c.add(car8);
		
		Iterator<Car> i = c.iterator();
		while (i.hasNext()) {
	     	System.out.println(i.next());
		}
		System.out.println(car2.toString());
	}
	
}
