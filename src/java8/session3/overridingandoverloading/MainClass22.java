package java8.session3.overridingandoverloading;
/*Muestra polimorfismo:
 * sí. La variable de referencia de tipo Clase A se refiere al objeto de tipo
 *  Clase A, el objeto de tipo Clase B y el objeto de tipo Clase C Esto muestra 
 *  el polimorfismo.*/
public class MainClass22 {
	public static void main(String[] args)
    {
        X22 a = new X22();
         
        a = new B();
         
        a = new C();
    }
}
