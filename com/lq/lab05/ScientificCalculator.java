package com.lq.lab05;

public class ScientificCalculator {

	public static final double PI = 3.14159;
	private  double holdValue;
	


	public double exp(double x){
		return Math.exp(x);
		
	}

	public double getValueFromMemory() {
		return holdValue;
	}

	public void putValueInMemory(double holdValue) {
		this.holdValue = holdValue;
	}

	public double log(double y) {
		return Math.log(y);
		
	}
}
