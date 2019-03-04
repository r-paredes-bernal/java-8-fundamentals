package java8.session3.overridingandoverloading;
//estan bien sobrecargados los metodos, tienen diferentes lista de argumentos
class X {
	  int method(int i, int d)
	    {
	        return i+d;
	    }
	     
	    static int method(int i, double d)
	    {
	        return (int)(i+d);
	    }
	     
	    double method(double i, int d)
	    {
	        return i+d;
	    }
	     
	    static double method(double i, double d)
	    {
	        return i+d;
	    }
}
