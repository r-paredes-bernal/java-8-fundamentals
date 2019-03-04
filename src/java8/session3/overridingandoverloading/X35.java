package java8.session3.overridingandoverloading;

class X35
{
    void methodABC()
    {
        new XYZ().methodXYZ();
    }
}
 
class XYZ extends X35
{
    void methodXYZ()
    {
        methodABC();
    }
}
