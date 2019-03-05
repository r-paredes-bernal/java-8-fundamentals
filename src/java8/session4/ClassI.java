package java8.session4;

class ClassI
{
    void superClassMethod(Number n)
    {
        System.out.println("From Super Class");
    }
}
 
class SubClassI extends ClassI
{
    void superClassMethod(Double d)
    {
        System.out.println("From Sub Class");
    }
}
