package Java8.Session1.Inheritance;

public interface Vehicle {

	// Las interfaces solo permiten modificadores public, final y estatic
	public int wheels=4;
	public int passangers=6;

	public void speedUp(int velosity);
	public void speedDown(int velosity);
}
