package com.lq.lab04;

public class Box {

	private double height;
	private double width;
	private double length;
	
	
	
	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}



	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
	}



	public double getLength() {
		return length;
	}



	public void setLength(double length) {
		this.length = length;
	}



	public Box(double height,double width,double length) {
		
		setHeight(height);
		setLength(length);
		setWidth(width);
		
	}
}
