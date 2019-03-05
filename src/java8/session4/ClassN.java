package java8.session4;

class ClassN
{
    void myMethod(Object o, Double D)
    {
        System.out.println(1);
    }
     
    void myMethod(Integer I, Number N)
    {
        System.out.println(2);
    }
}
 
class ClassO extends ClassN
{
    void myMethod(Float F, Double D)
    {
        System.out.println(3);
    }
     
    void myMethod(Double D, Integer I)
    {
        System.out.println(4);
    }
}