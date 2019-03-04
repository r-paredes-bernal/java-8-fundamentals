package java8.session3.overridingandoverloading;

public class MainClass3 {
	 void method(int ... a)// metodo duplicado
	    {
	        System.out.println(1);
	    }
	     
	    void method(int[] a)
	    {
	        System.out.println(2);
	    }
}
