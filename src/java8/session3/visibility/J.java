package java8.session3.visibility;

/*Because, Class-A itself has been defined with 
 * default access modifier. That means Class-A can
 *  be instantiated within the package in which it is
 *   defined. It can not be instantiated outside the 
 *   package, even though it has public constructor.
 */
//class J
public class J {
	public J() {
		// public constructor
	}
}
