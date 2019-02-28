package java8.session3.visibility.otherpackage;

public class A17 {
	private int methodOne(int i)
    {
        return ++i;
    }
     
    public int methodTwo(int i)
    {
        return methodOne(++i);
    }
}

