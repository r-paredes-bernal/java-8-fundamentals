package java8.session4;

class ClassV
{   
    String myMethod(String s)
    {
        return s+s;
    }
}
 
class ClassW extends ClassV
{
    String myMethod(String s, double d)
    {
        return myMethod(s+d);
    }
}
 
class ClassX extends ClassW
{
    String myMethod(String s, double d, int i)
    {
        return myMethod(s, d+i);
    }
}
