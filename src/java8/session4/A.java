package java8.session4;

class A1
{
     
}
 
class B extends A1
{
     
}
 
class C extends B
{
     
}
 
public class A 
{
    static void overloadedMethod(A1 a)
    {
        System.out.println("ONE");
    }
     
    static void overloadedMethod(B b)
    {
        System.out.println("TWO");
    }
     
    static void overloadedMethod(Object obj)
    {
        System.out.println("THREE");
    }
     
    public static void main(String[] args)
    {
        C c = new C();
         
        overloadedMethod(c);
    }
}
