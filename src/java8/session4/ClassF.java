package java8.session4;

class ClassF
{
    void calculate(int a, int b)
    {
        System.out.println("Class F");
    }
}
 
class ClassG extends ClassF
{
    @Override
    void calculate(int a, int b)
    {
        System.out.println("Class G");
    }
}
 
class ClassH extends ClassG
{
    @Override
    void calculate(int a, int b) 
    {
        System.out.println("Class H");
    }
}
