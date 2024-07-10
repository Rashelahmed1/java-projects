package com.lq.lab14;

public class Coffee {

	private int temperature;

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) throws TooHotException {
		
	
		if(temperature > 120) {
//			throw new TooHotException("Coffee is too hot");
			this.temperature = 0;
			System.out.println("Coffee is too hot");
		}
		else {
			this.temperature = temperature;
		}
	
	}
	
	public Coffee(int temp) throws TooHotException {
		setTemperature(temp);
	}
	
	
	
	
	
	
	
	
}
