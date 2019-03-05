package java8.session3.visibility;

import java8.session3.visibility.otherpackage.Q;

public class MainClass
{
    public static void main(String[] args)
    {
        O.methodOfC();
        
        System.out.println(new Q().methodOne(101));
        
    }
}

