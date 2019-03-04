package java8.session3.overridingandoverloading;

class X31
{
    static void methodOne()
    {
        System.out.println("AAA");
    }
}
 
class B31 extends X31
{
    static void methodOne()
    {
        System.out.println("BBB");
    }
}
