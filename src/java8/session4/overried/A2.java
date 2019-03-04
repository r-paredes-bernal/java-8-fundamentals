package java8.session4.overried;

class A2
{
    void method(int a)
    {
        System.out.println("ONE");
    }
     
    void method(double d)
    {
        System.out.println("TWO");
    }
}
 
class Y extends A2
{
    @Override
    void method(double d)
    {
        System.out.println("THREE");
    }
}