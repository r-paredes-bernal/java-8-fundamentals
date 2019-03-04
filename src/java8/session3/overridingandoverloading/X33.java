package java8.session3.overridingandoverloading;
/*SQLException no es compatible con la cl�usula de lanzamientos del m�todo de
 *  superclase. Si el m�todo de superclase no tiene cl�usula throws, entonces
 *   se puede anular solo con el tipo de excepciones sin marcar. SQLException
 *    no es un tipo de excepci�n sin marcar.*/
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