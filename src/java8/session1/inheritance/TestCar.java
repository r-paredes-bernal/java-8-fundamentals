package java8.session1.inheritance;

import java.util.Date;

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

	public static void main(String[] args) {
		Date d1 = new Date();
		Car myElectricCar = new ElectricCar(1, "Ioniq", d1, "Black", 1, 200);
		System.out.println("\n" + myElectricCar.toString());
		
		Date d2 = new Date();
		Car myGasolineCar= new GasolineCar(2, "Versa", d2, "Red", 10, 200);
		System.out.println("\n" + myGasolineCar.toString());
	}
}
