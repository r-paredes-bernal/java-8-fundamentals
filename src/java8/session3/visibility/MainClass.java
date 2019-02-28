package java8.session3.visibility;


public class MainClass extends E
{
    public static void main(String[] args)
    {
   //     F f = new F();  //pregunta 5)= inner class F no puede ser instaciada fuera de Clase E
    	
    // Pregunta 8
    	X x = new X();   
         System.out.println(x.i);  
         x.methodOfX();
         
         // PREGUNTA #14
         M1.methodOfC();
         
         // PREGUNTA #17
         System.out.println(new Contador2().methodOne(101));
    }
}