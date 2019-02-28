package java8.session3.visibility;
/*¿El código de abajo está escrito correctamente? Si es así, 
 * ¿cuál será la salida? La salida es A
 * 
 * */
class A14
{
    protected static String s = "A";
}
 
class B extends A14
{
     
}
 
class C extends B
{   
    static void methodOfC()
    {
        System.out.println(s);
    }
}
 


