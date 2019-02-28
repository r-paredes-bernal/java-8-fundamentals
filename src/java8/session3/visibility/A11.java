package java8.session3.visibility;
/*11) ¿Por qué la línea 17 en el código de abajo está generando un error de
 *  tiempo de compilación? Porque, no podemos crear una instancia de una 
 *  clase fuera del paquete que solo tiene constructores protegidos.
 * 
 *  */
public class A11 {
	protected A11()
    {
        //protected constructor
    }
}
