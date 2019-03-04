package java8.session3.overridingandoverloading;
/* lanzará java.lang.ClassCastException en tiempo de ejecución. Porque,
 *  Y no puede ser lanzado a Z.*/
public class MainClass10 {
	 public static void main(String[] args)
	    {
	        X10 x = new Y10();
	         
	        x.calculate(10, 20);
	         
	        Y10 y = (Y10) x;
	         
	        y.calculate(50, 100);
	         
	        Z10 z = (Z10) y;
	         
	        z.calculate(100, 200);
	    }
}
