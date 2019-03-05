package java8.session4;

class ClassL
{
    public ClassL(int i)
    {
        System.out.println(myMethod(i));
    }
     
    int myMethod(int i)
    {
        return ++i + --i;
    }
}
 
class ClassM extends ClassL
{
    public ClassM(int i, int j)
    {
        super(i*j);
         
        System.out.println(myMethod(i, j));
    }
     
    int myMethod(int i, int j)
    {
        return myMethod(i*j);
    }
}
