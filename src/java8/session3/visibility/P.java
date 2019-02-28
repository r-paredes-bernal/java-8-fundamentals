package java8.session3.visibility;

public class P
{
    private int methodOne(int i)
    {
        return ++i;
    }
     
    public int methodTwo(int i)
    {
        return methodOne(++i);
    }
}
 

