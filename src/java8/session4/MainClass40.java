package java8.session4;

class ABCC
{   
    String myMethod(String s)
    {
        return s+s;
    }
}
 
class PQR extends ABCC
{
    String myMethod(String s, double d)
    {
        return myMethod(s+d);
    }
}
 
class XYZZ extends PQR
{
    String myMethod(String s, double d, int i)
    {
        return myMethod(s, d+i);
    }
}
 
public class MainClass40
{
    public static void main(String[] args)
    {
        XYZZ xyz = new XYZZ();
         
        System.out.println(xyz.myMethod("JAVA", 23.23, 111));
    }   
}