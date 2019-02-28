package java8.session3.visibility;

class P {
	protected static String s = "A";
}

class Q extends P
{
     
}
 
class R extends Q
{   
    static void methodOfC()
    {
        System.out.println(s);
    }
}

