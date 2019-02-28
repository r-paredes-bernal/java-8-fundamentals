package java8.session3.visibility;
/*4) ¿El campo 'i' de la Clase A se hereda a la Clase B en el
 *  siguiente código?  si porque esta heredando, incluso si la clase B4
 *   se encuentra en otro paquete
 *  */
class A4
{
    protected int i;
}
 
class B4 extends A4
{
     public void test() {
    	 System.out.println(i);
     }
}
