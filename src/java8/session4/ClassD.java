package java8.session4;

class ClassD
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
 
class ClassE extends ClassD
{
    @Override
    void method(double d)
    {
        System.out.println("THREE");
    }
}
