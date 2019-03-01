package pkg.pas.mod_acceso_inner_class;

//21) Monu has written the code like below but it is showing compile time error. 
//Can you help him to remove the error?
public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class A
{
    private class B
    {
        private class C
        {
             
        }
    }
}
//R=La clase externa debe tener modificador public, final o abstract o edefault