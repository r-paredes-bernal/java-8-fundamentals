package java8.session4;

class ABC
{
    void methodABC()
    {
        new XYZ().methodXYZ();
    }
}
 
class XYZ extends ABC
{
    void methodXYZ()
    {
        methodABC();
    }
}
 
public class MainClass35
{
    public static void main(String[] args)
    {
        new ABC().methodABC();
    }   
}