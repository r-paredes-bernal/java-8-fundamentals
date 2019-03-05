package java8.session4;

public class Main {
	
	      
	
		 static void overloadedMethod(ClassA a)
		    {
		        System.out.println("ONE");
		    }
		     
		    static void overloadedMethod(ClassB b)
		    {
		        System.out.println("TWO");
		    }
		     
		    static void overloadedMethod(Object obj)
		    {
		        System.out.println("THREE");
		    }
		     
		    static void method(Integer i)
		    {
		        System.out.println(1);
		    }
		     
		    static void method(Double d)
		    {
		        System.out.println(2);
		    }
		     
		    static void method(Number n)
		    {
		        System.out.println(4);
		    }
		     
		    static void method(Object o)
		    {
		        System.out.println(5);
		    }
		    
		    public static void main(String[] args)
		    {
		        ClassC c = new ClassC();
		         
		        overloadedMethod(c);
		        
		        new ClassE().method(100);
		        
		        /*ClassF f = new ClassF();
		         
		        f.calculate(10, 20);
		         
		        ClassG g = (ClassG) f;
		         
		        g.calculate(50, 100);
		         
		        ClassH h = (ClassH) g;
		         
		        h.calculate(100, 200);*/
		        
		        SubClassI sub = new SubClassI();
		         
		        sub.superClassMethod(123321);
		        
		        new ClassJ().ClassJ();
		        
		        method((short)12);
		        
		        ClassK k = new ClassK();
		         
		        k.method("JAVA");
		        
		        ClassM m = new ClassM(12, 21);	
		        
		        ClassO o = new ClassO();
		         
		        o.myMethod(11.11, 0000);
		         
		        o.myMethod(8778, 3223);
		         
		        o.myMethod(2.3*1.2, 4.1*1.4);
		         
		        o.myMethod((float)23.56, 21.45);
		        
		        ClassP p = new ClassQ();
		         
		        p.methodOne();
		        
		        //new ClassR().methodABC(); //StackOverflowError.
		        
		        ClassT t = new ClassU();
		         
		        t.methodABC(10);
		         
		        t.methodABC();
		        
		        ClassX x = new ClassX();
		         
		        System.out.println(x.myMethod("JAVA", 23.23, 111));
		        
		    } 

}
