package java8.session3.visibility.otherpackage;

import java8.session3.visibility.A17;

class A17_B extends A17
{
    int methodOne(int i)
    {
        return methodTwo(++i);
    }
}
 

