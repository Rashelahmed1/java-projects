package com.lq.lab07;
import com.lq.lab05.BasicCalculator;
import com.lq.lab05.ScientificCalculator;

public class CalculatorDriverMain {

	public static void main(String[] args) {
		BasicCalculator b1 = new BasicCalculator();

		double addResult = b1.add(1.1, 1.2);	
		double subTract = b1.subtract(5, 2);
		double multiply = b1.multiply(4, 3);
		double divide = b1.divide(5, 2);
				
		System.out.println("Addition = " +addResult);
		System.out.println("SubTract = " +subTract);
		System.out.println("Multiply = " +multiply);
		System.out.println("Divide = " +divide);
		
		System.out.println("----------------------");
		
		ScientificCalculator c1 = new ScientificCalculator();
		
		double expResult = c1.exp(2.3);
		double logResult = c1.log(3.4);

		System.out.println( "Exp = " +expResult);
		System.out.println("Log = " +logResult);

	}

}
