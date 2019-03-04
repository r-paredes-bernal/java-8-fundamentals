package java8.session3.overridingandoverloading;

class X17
{
    public X17(int i)
    {
        System.out.println(1);
    }
     
    public X17()
    {
        this(10);
         
        System.out.println(2);
    }
     
    void X17()
    {
    	X17(1);
         
        System.out.println(3);
    }
     
    void X17(int i)
    {
        System.out.println(4);
    }
}