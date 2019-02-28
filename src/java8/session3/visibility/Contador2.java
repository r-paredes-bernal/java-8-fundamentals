package java8.session3.visibility;

import java8.session3.visibility.otherpackage.Contador;

public class Contador2  extends Contador{
	int methodOne(int i)
    {
        return methodTwo(++i);
    }
}
