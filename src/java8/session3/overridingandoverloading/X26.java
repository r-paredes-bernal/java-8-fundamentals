package java8.session3.overridingandoverloading;

class X26
{
    public X26(int i)
    {
        System.out.println(myMethod(i));
    }
     
    int myMethod(int i)
    {
        return ++i + --i;
    }
}
 
class B26 extends X26
{
    public B26(int i, int j)
    {
        super(i*j);
         
        System.out.println(myMethod(i, j));
    }
     
    int myMethod(int i, int j)
    {
        return myMethod(i*j);
    }
}
