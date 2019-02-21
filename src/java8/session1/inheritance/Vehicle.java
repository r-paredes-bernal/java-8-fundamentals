package java8.session1.inheritance;

/**
 * 
 * @author v.ramos.croda
 *
 */
public interface Vehicle {
	
	/*variable for passengers*/
	public Integer passengers=0;
	
	/*variable from wheels*/
	Integer wheels=0;
	
	/**
	 * method to speed up from vehicle
	 * @param value
	 */
	public void speedUp(Integer value);
	
	/**
	 * method from speedDown from vehicle
	 * @param value
	 */
	public void speedDown(Integer value);
	
}
