package com.lq.lab11;

public class Box extends Shape{

	private double height;
	private double width;
	private double length;
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if(height <= 0 ) {
			System.out.println("Height must be greater than zero");
			this.height = 1 ;
		}
		else {
			this.height = height;
		}
		
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if(width <= 0) {
			System.out.println("Width must be getter than zero");
			this.width = 1;
		}
		else {
			this.width = width;
		}
		
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		if(length <= 0) {
			System.out.println("Length must be greather than zero");
			this.length = 1 ;
		}
		else {
			this.length = length;
		}
		
	}
	
	public Box(double height,double width,double length) {
		
		setHeight(height);
		setLength(length);
		setWidth(width);
		
	}


	public Box(double side) {
		setHeight(side);
		setLength(side);
		setWidth(side);
	}





	

}
