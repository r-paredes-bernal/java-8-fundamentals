package pkg.pas.mod_acceso_static;

//Question 14
//14) Is the below code written correctly? If yes, what will be the output?
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C.methodOfC();
		C c = new C();
		c.methodOfC();
	}

}

class A
{
    protected static String s = "A";
}
 
class B extends A
{
     
}
 
class C extends B
{   
    static void methodOfC()
    {
        System.out.println(s);
    }
}
//R=Yes, it is written correctly. Output will be A.