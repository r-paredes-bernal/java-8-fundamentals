package java8.session3.visibility;
/*11) �Por qu� la l�nea 17 en el c�digo de abajo est� generando un error de
 *  tiempo de compilaci�n? Porque, no podemos crear una instancia de una 
 *  clase fuera del paquete que solo tiene constructores protegidos.
 * 
 *  */
public class A11 {
	protected A11()
    {
        //protected constructor
    }
}
