package java8.session4.overried;

public class ClassMain {
	/*a1
	static void overloadedMethod(A1 a)
    {
        System.out.println("ONE");
    }
     
    static void overloadedMethod(B b)
    {
        System.out.println("TWO");
    }
     
    static void overloadedMethod(Object obj)
    {
        System.out.println("THREE");
    }
     
    public static void main(String[] args)
    {
        C c = new C();
         
        overloadedMethod(c);
    } */
	
	/* A2
	   public static void main(String[] args)
	 
	    {
	        new Y().method(100);
	    }*/
	
	double overloadedMethod(double d)
	    {
	        return d *= d;
	    }
	     
	    int overloadedMethod(int i)
	    {
	        return overloadedMethod(i *= i);
	    }
	     
	    float overloadedMethod(float f)
	    {
	        return overloadedMethod(f *= f);
	    }
	     
	    public static void main(String[] args)
	    {
	        ClassMain main = new ClassMain();
	         
	        System.out.println(main.overloadedMethod(100));
	    } 
	
 
}
