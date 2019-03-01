package pkg.pas.mod_acceso_2;
import pkg.pas.mod_acceso_1.*;

//9) Why we can’t instantiate Class-A in the below code outside the package even 
//   though it has public constructor?
class B {
	    //A a = new A();       //Compile Time Error
}
//R=La clase A solo puede ser instanciada si es publica en el paquete pkg.pas.mod_acceso_1