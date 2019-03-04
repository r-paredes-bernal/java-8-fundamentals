package java8.session3.overridingandoverloading;
/*SQLException no es compatible con la cláusula de lanzamientos del método de
 *  superclase. Si el método de superclase no tiene cláusula throws, entonces
 *   se puede anular solo con el tipo de excepciones sin marcar. SQLException
 *    no es un tipo de excepción sin marcar.*/
class X33
{
    void myMethod()
    {
        System.out.println("Super Class");
    }
}
 
class B33 extends X33
{
    @Override
    void myMethod() throws SQLException
    {
        System.out.println("Sub Class");
    }
}