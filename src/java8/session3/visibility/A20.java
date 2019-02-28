package java8.session3.visibility;
/*20) Un método de superclase con modificador de acceso predeterminado 
 * se puede anular como protegido o público pero no como privado. 
 * ¿Verdadero o falso? verdadero--> mientras mas abierto este la visibilidad si se puede
 * visibilidad mas cerrada no se puede
 * */
class A20
{
     void methodOfA()
    {
        System.out.println("Class A");
    }
}
 
class A20_B extends A20
{
    @Override
    public void methodOfA()
    {
        System.out.println("Class B");
    }
   /* @Override
    protected void methodOfA()  si se culple tambien
    {
        System.out.println("Class B");
    } */
}