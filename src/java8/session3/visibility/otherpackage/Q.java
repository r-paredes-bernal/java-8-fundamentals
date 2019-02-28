package java8.session3.visibility.otherpackage;

import java8.session3.visibility.P;

class Q extends P 
{
    int methodOne(int i)
    {
        return methodTwo(++i);
    }
}

class MainClass
{
    public static void main(String[] args)
    {
        System.out.println(new Q().methodOne(101));
    }
}

