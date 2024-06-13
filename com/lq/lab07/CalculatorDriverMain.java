package com.lq.lab07;
import com.lq.lab05.BasicCalculator;
import com.lq.lab05.ScientificCalculator;
import com.lq.lab05.TrigonometricCalculator;

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
		
		System.out.println("----------------------");
		
		TrigonometricCalculator t1 = new TrigonometricCalculator();
		
		double sineResult = t1.sine(0.1);
		double cosineResult = t1.cosine(0.2);
		double tangetResult = t1.tangent(0.3);
		double arcsineResult = t1.arcsine(0.4);
		double arccosineResult = t1.arccosine(0.5);
		double arctangentResult = t1.arctangent(0.6);
		
		System.out.println();
		System.out.println("Sine = " +sineResult);
		System.out.println("Cosine = " +cosineResult);
		System.out.println("Tanget = " +tangetResult);
		System.out.println("Arcsine = " +arcsineResult);
		System.out.println("Arccosine = " +arccosineResult);
		System.out.println("Arctanget = " +arctangentResult);
		
	
	
	
	
	
	
	
	
	
	
	}

}
