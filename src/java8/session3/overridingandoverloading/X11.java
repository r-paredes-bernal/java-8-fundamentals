/*No se pueden anular los m�todos est�ticos.*/
class X11
{
    static void methodOfX()
    {
        System.out.println("Class X");
    }
}
 
class Y11 extends X11
{
    @Override
    static void methodOfX()
    {
        System.out.println("Class X");
    }
}
