package java8.session3.visibility.otherpackage;

import java8.session3.visibility.*;

class H extends G
{
	  //pregunta #9  la calse J es defult y no puede ser iinstaciado fuer del paquete  aunque el construcor sea publico
	   J j = new J(); 
	  // PREGUNTA #11 no se puede instanciar fuera del paquete con constructor protcted
	   K k = new K();
}
