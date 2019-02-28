package java8.session3.visibility;
// PREGUNTA #14 
public class A14 {
	protected static String s = "class M";
}

class M1 extends A14{
	

}

class M2 extends M1{
	
	static void methodOfC()
    {
        System.out.println(s);
    }
}
