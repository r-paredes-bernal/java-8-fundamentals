package java8.session3.visibility;

public class A18 {
	
	public void methodOfA()
    {
        System.out.println("Class A");
    }

}

class N2 extends A18{
	
	// La visibilidad de methodOfA () se ha reducido al valor 
    //predeterminado al anularlo en la clase B. No se puede 
	//reducir la visibilidad de un método al anularlo.

	@Override
    void methodOfA()  {
        System.out.println("Class B");
    }
}
