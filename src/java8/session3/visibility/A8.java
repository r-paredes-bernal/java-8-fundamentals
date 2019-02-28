package java8.session3.visibility;
/*8) ¿Crees que el siguiente programa está escrito correctamente? Si es así, ¿cuál será la salida?
 * salida: 
 * 1221
 * 1221
 * */
class A8
{
    protected int i = 1221;
     
    void methodOfX()
    {
        System.out.println(i);
    }
}