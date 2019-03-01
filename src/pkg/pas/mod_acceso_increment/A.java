package pkg.pas.mod_acceso_increment;

//17) What will be the outcome of the below program?

public class A
{
    private int methodOne(int i)
    {
    	System.out.println("Metodo methodOne de la clase pkg.pas.mod_acceso_increment.A "+i);
        return ++i;
    }
     
    public int methodTwo(int i)
    {
    	System.out.println("Metodo methodTwo de la clase pkg.pas.mod_acceso_increment.A "+i);
        return methodOne(++i);
    }
}
//R=104
