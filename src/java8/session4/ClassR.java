package java8.session4;

class ClassR
{
    void methodABC()
    {
        new ClassS().methodXYZ();
    }
}
 
class ClassS extends ClassR
{
    void methodXYZ()
    {
        methodABC();
    }
}