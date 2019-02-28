package java8.session3.visibility;
/*
 * 13) Can we declare static methods as private?
 * si, el metodo no se puede usar en otras clases al ser privado
 */
public class A13 {
 private static int prueba() {
	 return 0;
 }
 
 public static void main(String args[]) {
	System.out.println(prueba());
 }
}
