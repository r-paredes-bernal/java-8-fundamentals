package java8.session3.visibility;
/*�El c�digo de abajo est� escrito correctamente? Si es as�, 
 * �cu�l ser� la salida? La salida es A
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
 


