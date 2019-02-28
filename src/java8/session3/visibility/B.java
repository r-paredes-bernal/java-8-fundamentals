package java8.session3.visibility;
//inner classes can be private, but outer classes can not private
//private class B <--ERROR
public class B 
{
	private class C
	{
		//Inner class
	}
}
