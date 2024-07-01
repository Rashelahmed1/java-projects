package com.lq.lab11;

public class Circle extends Shape implements TwoDimensional{
	
	private double radious;
	
	public double getRadious() {
		return radious;
	}

	public void setRadious(double radious) {
		this.radious = radious;
	}

	public Circle(double radious){
		this.setRadious(radious);
	}
	
	public double getArea() {
		return Math.PI * radious * radious ;
	}

	public double getPerimeter() {
		return 2 * Math.PI*radious ;
	}

	@Override
	public String toString() {
		return "Circle [getRadious()=" + getRadious() + ", getArea()=" + getArea() + ", getPerimeter()="
				+ getPerimeter() + ", getColor()=" + getColor() + ", getName()=" + getName() + "]";
	}

	
	




}
