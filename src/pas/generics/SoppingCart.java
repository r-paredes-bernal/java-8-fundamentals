package pas.generics;

import java.util.ArrayList;
import javax.xml.namespace.QName;
public class SoppingCart {

	static final String URI = "http://localhost:8080/WebServiceCFX/services/datosEmp?wsdl";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoppingCartt shoop = new SoppingCartt();
		shoop.add(new Product(1001,"Computadora",18500));
		shoop.add(new Product(3004,"Pantalla",9000));
		shoop.add(new Product(2101,"Mouse",800));
		shoop.imprimir();
		shoop.imprimir2();
		
		
		
	}

}
