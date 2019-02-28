package java8.session3.visibility;

import java8.session3.visibility.otherpackage.A17;

public class A17_2  extends A17{
	int methodOne(int i)
    {
        return methodTwo(++i);
    }
}
