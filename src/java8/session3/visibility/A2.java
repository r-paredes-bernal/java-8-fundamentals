package java8.session3.visibility;
/*2) ¿Puedes crear una subclase para la siguiente clase?NO
 * Porque el constructor en la super clase no es visible por que es privado*/
class A2 {
	
	    private A2()
	    {
	        //First Constructor
	    }
	     
	    private A2(int i)
	    {
	        //Second Constructor
	    }
	    
}
class B2 extends A2{
	    	
}
