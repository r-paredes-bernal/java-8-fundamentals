package java8.session3.visibility;


class M
{
    protected static String s = "A";
}
 
class N extends M
{
     
}
 
class O extends N
{   
    static void methodOfC()
    {
        System.out.println(s);
    }
}
