package pkg.pas.mod_acceso;

public class AppModAcceso {

	//1.- What is the use of access modifiers in Java?
	// R=Access Modifiers in Java are used to control the visibility of fields, 
	//   methods, classes and constructors.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Pregunta 2
		A a = new A();
		A a1 = new A(2);
		*/
		
		Y y = new Y();
		System.out.println(y.i);
	}

}

//Question 2
class A
{
    private A()
    {
        //First Constructor
    }
     
    private A(int i)
    {
        //Second Constructor
    }
}
//R=No porque tiene los constructures privados

//3) Can you find out the error in the below code?

class B
{
    private class C
    {
        //Inner class
    }
}
//R= La clase inner puede ser privada, pero la externa no.

//Question 4 Does field ‘i’ of Class A be inherited to Class B in the below code?

class Z
{
    protected int i=99;
}
 
class Y extends Z
{
     
}
//R= Yes, protected members of a class are inherited to any sub class.

//5) Is the below code written correctly?
class Q
{
    private class U
    {
        //inner class
    }
}
 
class MainClass extends Q
{
    public static void main(String[] args)
    {
        //U u = new U();
    }
}
//R=No puede haber 2 clases public en el mismo archivo de clase. Ademas
//No se puede instanciar la clase U ya que es privada.
