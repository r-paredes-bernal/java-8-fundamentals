package java8.session4;

class ClassT
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
 
class ClassU extends ClassT
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
