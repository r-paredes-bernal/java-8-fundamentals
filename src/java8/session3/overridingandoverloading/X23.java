package java8.session3.overridingandoverloading;

class X23
{
    int method(int i)
    {
        return i *= i;
    }
}
 
class Y extends X23
{
    double method(double d)
    {
        return d /= d;  
    }
}
 
class Z extends Y
{
    float method(float f)
    {
        return f += f;
    }
}