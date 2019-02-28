package java8.session3.visibility;
/*¿Puedes encontrar el error en el siguiente fragmento de código?
 * No se puede reducir la visibilidad de un metodo heredado*/
class A18
{
    public void methodOfA()
    {
        System.out.println("Class A");
    }
}
 
class A18_B extends A18
{
    @Override
    void methodOfA()
    {
        System.out.println("Class B");
    }
}
