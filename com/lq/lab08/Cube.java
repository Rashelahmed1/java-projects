package com.lq.lab08;

public class Cube extends Box{
	
	private double side;
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
			}

	public Cube(double side) {
		
		super (side,side,side);
		setSide(side);
	}


	














}
