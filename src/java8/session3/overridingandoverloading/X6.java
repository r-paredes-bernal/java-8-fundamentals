package java8.session3.overridingandoverloading;

	class X6
	{
	    void method(int a)
	    {
	        System.out.println("ONE");
	    }
	     
	    void method(double d)
	    {
	        System.out.println("TWO");
	    }
	}
	 
	class Y6 extends X6
	{
	    @Override
	    void method(double d)
	    {
	        System.out.println("THREE");
	    }
	}

