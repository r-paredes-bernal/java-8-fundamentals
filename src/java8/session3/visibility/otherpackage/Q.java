package java8.session3.visibility.otherpackage;

import java8.session3.visibility.P;

public class Q extends P 
{
   public int methodOne(int i)
    {
        return methodTwo(++i);
    }
}


