package java8.session3.visibility;
// PREGUNTA #14 
public class M {
	protected static String s = "class M";
}

class M1 extends M{
	
	static void methodOfC()
    {
        System.out.println(s);
    }
}

