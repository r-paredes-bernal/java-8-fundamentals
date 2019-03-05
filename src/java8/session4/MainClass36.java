package java8.session4;

class ABCD
{   
    void methodABC()
    {
        System.out.println(111);
    }
     
    void methodABC(int i)
    {
        System.out.println(222);
    }
}
 
class WXYZ extends ABCD
{
    @Override
    void methodABC(int i)
    {
        System.out.println(333);
    }
     
    @Override
    void methodABC()
    {
        System.out.println(444);
    }
}
 
public class MainClass36
{
    public static void main(String[] args)
    {
        ABCD abc = new WXYZ();
         
        abc.methodABC(10);
         
        abc.methodABC();
    }   
}