package com.lq.lab07;
import com.lq.lab05.BasicCalculator;

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

	}

}
