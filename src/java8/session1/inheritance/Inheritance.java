package Java8.Session1.Inheritance;

import java.util.Date;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      Car car = new Car(1,"Jetta",2019,"Blue",new Date());
      
      System.out.println(car.toString());
            
      System.out.println("Costo del carro="+car.calculataCost()+" Precio del Carro="+car.calculatePrice());
	}

}
