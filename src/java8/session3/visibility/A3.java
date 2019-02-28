package java8.session3.visibility;
/*3) ¿Puedes encontrar el error en el siguiente código?
 * La clase externa no puede ser privada..solo puede ser publica o default*/

//public class A3 <----- lo correcto
private class A3
{
    private class B3
    {
        //Inner class
    }
}
