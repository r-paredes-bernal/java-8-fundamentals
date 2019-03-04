package java8.session3.overridingandoverloading;

class SuperClass14
{
    void superClassMethod(Number n)
    {
        System.out.println("From Super Class");
    }
}
 
class SubClass extends SuperClass14
{
	
    void superClassMethod(Double d)
    {
        System.out.println("From Sub Class");
    }
}
 
