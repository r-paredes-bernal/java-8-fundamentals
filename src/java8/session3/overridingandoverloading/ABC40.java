package java8.session3.overridingandoverloading;
class ABC40
{   
    String myMethod(String s)
    {
        return s+s;
    }
}
 
class PQR40 extends ABC40
{
    String myMethod(String s, double d)
    {
        return myMethod(s+d);
    }
}
 
class XYZ40 extends PQR40
{
    String myMethod(String s, double d, int i)
    {
        return myMethod(s, d+i);
    }
}
