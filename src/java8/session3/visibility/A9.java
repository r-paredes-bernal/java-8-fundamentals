package java8.session3.visibility;
/* 9) �Por qu� no podemos crear una instancia de Clase A 
 * en el siguiente c�digo fuera del paquete a pesar de que tiene 
 * un constructor p�blico?
 * Porque, la Clase A se ha definido con el modificador 
 * de acceso predeterminado. Eso significa que la clase A
 *  puede crearse una instancia dentro del paquete en el que se define.
 *   No se puede crear una instancia fuera del paquete, a pesar de que
 *    tiene un constructor p�blico.
 * */
class A9 {
	public A9()
    {
        //public constructor
    }
}
