package java8.session1.inheritance;


import java.util.Date;

public class Inheritance {

	static int t=20;
	static int counter;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

      Car car = new Car(1,"Jetta",2019,"Blue",new Date());
      
      System.out.println(car.toString());
            
      System.out.println("Costo del carro="+car.calculataCost()+" Precio del Carro="+car.calculatePrice());
      
      String strCadena="Historia del Arte";
      //Una forma
      char[] strArray =strCadena.toCharArray();
      for(int i=strArray.length-1;i>=0;i--){
    	  System.out.print(strArray[i]);
      }
      //Segunda Forma
      StringBuilder sb = new StringBuilder();
      sb.append(strCadena);
      System.out.println();
      System.out.println(sb.reverse());
      
      for(int t=0;t<5;t++){
    	  System.out.println("t="+t);
      }
      
      Long l = new Long(5);
      int i = 0b1100011110;
      Float _f=2.78F;
      
      System.out.println("Counter antes="+counter);
      counter();
      System.out.println("Despues="+counter);
           
	}
	
	public static void counter(){
		counter++;
	}

}

