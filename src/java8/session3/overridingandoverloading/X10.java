package java8.session3.overridingandoverloading;

class X10
{
    void calculate(int a, int b)
    {
        System.out.println("Class X");
    }
}
 
class Y10 extends X10
{
    @Override
    void calculate(int a, int b)
    {
        System.out.println("Class Y");
    }
}
 
class Z10 extends Y10
{
    @Override
    void calculate(int a, int b) 
    {
        System.out.println("Class Z");
    }
}
