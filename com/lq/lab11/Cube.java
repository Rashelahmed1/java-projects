package com.lq.lab11;

public class Cube extends Box{
	
	private double side;
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		if(side <= 0) {
			System.out.println("side must be greater than zero");
			this.side =1 ;
		}
		else {
			this.side = side;
		}
		
	}

	public Cube(double side) {
		
		super (side,side,side);
		setSide(side);
	}


	


	














}
