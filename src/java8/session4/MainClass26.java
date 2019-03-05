package java8.session4;

class Aa
{
    public Aa(int i)
    {
    	  System.out.println(1);
        System.out.println(myMethod(i));
    }
     
    int myMethod(int i)
    {
        return ++i + --i;
    }
}
 
class Bb extends Aa
{
    public Bb(int i, int j)
    {
        super(i*j);
      
        System.out.println(myMethod(i, j));
    }
     
    int myMethod(int i, int j)
    {
        return myMethod(i*j);
    }
}
 
public class MainClass26
{
    public static void main(String[] args)
    {
        Bb b = new Bb(12, 21);
    }   
}
