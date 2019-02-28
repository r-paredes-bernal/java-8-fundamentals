package java8.session3.visibility.otherpackage;

import java8.session3.visibility.A10;

public class A10_B extends A10 {
	public void prueba() {
		System.out.println("Accediendo a miembro protected:" + a);
	}
}
