package java8.session5.generics2;

public class Principal {
	public static void main(String args[]) {
		ShoppingCart sp=new ShoppingCart();
		Product p= new Product(3, "computadora", 200);
		Product	p2=new Product(5,"lap",300);
		Product	p3=new Product(2,"pantalla",300);
		Product	p4=new Product(1,"mouse",300);
		Product	p5=new Product(4,"cpu",300);

				sp.add(p);
				sp.add(p2);
				sp.add(p3);
				sp.add(p4);
				sp.add(p5);
				sp.print();
	}
}
