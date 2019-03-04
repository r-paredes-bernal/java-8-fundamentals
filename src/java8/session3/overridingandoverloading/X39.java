package java8.session3.overridingandoverloading;
//¿se ha anulado correctamente "methodOfX ()" en las subclases de Clase X? si
class X39
{   
    void methodOfX()
    {
        System.out.println("Class X");
    }
}
 
class Y39 extends X39
{
    @Override
    protected void methodOfX()
    {
        System.out.println("Class Y");
    }
}

class Z39 extends Y39
{
    @Override
    public void methodOfX()
    {
        System.out.println("Class Z");
    }
}
