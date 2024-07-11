package com.lq.lab14;

public class CoffeeExerciser {

	public static void main(String[] args)  {
		Coffee c = null;
		try {
			c = new Coffee(130);
		} catch (TooHotException e) {
			
			e.printStackTrace();
		}
		System.out.println(c.getTemperature());
}
}
