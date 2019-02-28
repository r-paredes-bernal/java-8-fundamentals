package java8.session3.visibility;


public class MainClass extends A5
{
    public static void main(String[] args)
    {
     //  F f = new F();  //pregunta 5)= inner class F no puede ser instaciada fuera de Clase E
    	
    // Pregunta 8
    	X8 x = new X8();   
         System.out.println(x.i);  
         x.methodOfX();
         
         // PREGUNTA #14
         M2.methodOfC();
         
         // PREGUNTA #17
         System.out.println(new A17_2().methodOne(101));
    }
}