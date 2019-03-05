package java8.session4;

class P
{
    static void methodOne()
    {
        System.out.println("AAA");
    }
}
 
class O extends P
{
    static void methodOne()
    {
        System.out.println("BBB");
    }
}
 
public class MainClass31
{
    public static void main(String[] args)
    {
        P a = new O();
         
        a.methodOne();
    }   
}