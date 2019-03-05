package java8.session4;

class Xx
{
    int method(int i)
    {
        return i *= i;
    }
}
 
class Yy extends Xx
{
    double method(double d)
    {
        return d /= d;  
    }
}
 
class Zz extends Yy
{
    float method(float f)
    {
        return f += f;
    }
}
 
public class MainClass23
{
    public static void main(String[] args)
    {
        Zz z = new Zz();
         
        System.out.println(z.method(21.12));
    }
}