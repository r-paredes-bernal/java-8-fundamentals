package pkg.pas.mod_acceso_increment1;

import pkg.pas.mod_acceso_increment.*;

//17) What will be the outcome of the below program?

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new B().methodOne(101));
	}

}

class B extends A
{
    int methodOne(int i)
    {
    	System.out.println("Metodo methodOne de la clase pkg.pas.mod_acceso_increment1.B "+i);
        return methodTwo(++i);
    }
}
//R=104