package java8.session3.visibility.otherpackage;
/*Because, we can’t instantiate a class 
 * outside the package 
 * which has only protected constructors.
 */
import java8.session3.visibility.L;
class M {
	 L l = new L();
}
