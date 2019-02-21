package java8.session1.inheritance.impl;

import java8.session1.inheritance.interfaces.FinancialCalculations;

public class FinancialCalculationsImpl implements FinancialCalculations{
	private double calculate = 0;
	
	
	@Override
	public double calculatePrice() {
		
		calculate = 3;
		calculate = calculate;		
		
		return calculate;
	}
	
	@Override
	public double calculateCost() {
		
		calculate =5;
		calculate = calculate +2;
				
		
		return calculate;
	}
	
}
