package java8.session3.visibility.otherpackage;
/*Because, Class-A itself has been defined with 
 * default access modifier. That means Class-A can
 *  be instantiated within the package in which it is
 *   defined. It can not be instantiated outside the 
 *   package, even though it has public constructor.
 */
import java8.session3.visibility.J;
class K {
J j = new J();
}
