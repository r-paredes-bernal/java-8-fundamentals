package java8.session3.visibility;
/*5) ¿El código de abajo está escrito correctamente?
 * No. La clase B interna privada no puede ser instanciada fuera de la Clase A.
 * */
class A5
{
    private class B5
    {
        //inner class
    }
}
