package java8.session3.visibility;
/*19) El m�todo privado puede ser anulado como m�todo p�blico. �Verdadero o falso?
 * Falso
 * El metodo no puede ser sobreescrito o implementado 
 * por que los metodos privado no se heredan*/
public class A19 {
	private void methodOfA()
    {
        System.out.println("Class A");
    }
}
class A19_B extends A19
{
    @Override
   public void methodOfA()
    {
        System.out.println("Class B");
    }
}