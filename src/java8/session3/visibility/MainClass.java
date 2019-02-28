package java8.session3.visibility;

//No, private inner Class F can not be instantiated outside the class E
public class MainClass /*extends E */ {
	public static void main(String[] args) {
		// F f = new F();
		/*I i = new I();
		System.out.println(i.i);
		i.methodOfX(); */
		R.methodOfC();
	}
}