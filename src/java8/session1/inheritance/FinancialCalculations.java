package java8.session1.inheritance;

/**
 * 
 * @author v.ramos.croda
 *
 */
public interface FinancialCalculations {

	/*variable for price*/
	public Double price=0.0D;
	
	/*variable for cost*/
	public Double cost=0.0D;
	
	/**
	 * method to calculate price
	 * @return Double
	 */
	public Double calculatePrice();
	
	/**
	 * method to calculate cost
	 * @return Double
	 */
	public Double calculateCost();
	
}
