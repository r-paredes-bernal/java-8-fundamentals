package java8.session4;

class  K
{
    public K(int i)
    {
        System.out.println(1);
    }
     
    public K()
    {
    	
        this(10);
    
        System.out.println(2);
    }
     
    void K()
    {
        K(10);
         
        System.out.println(3);
    }
     
    void K(int i)
    {
        System.out.println(4);
    }
}
 
 
public class MainClass17
{   
    public static void main(String[] args)
    {
        new K().K();
    }
}