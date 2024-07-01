package com.lq.lab11;

public class Rectangle extends Shape implements TwoDimensional{

	private double length;
	private double width;
	public Rectangle(double length,double width) {
		super.setColor("White");
		super.setName("Unknown");
		setLength(length);
		setWidth(width);
		}
	public Rectangle(double length,double width,String name,String color) {
		super.setColor(color);
		super.setName(name);
		setLength(length);
		setWidth(width);
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	

	
	@Override
	public double getArea() {
		
		return getWidth()*getLength();
	}
	@Override
	public double getPerimeter() {
		
		return 2*(getLength() + getWidth());
	}
	@Override
	public String toString() {
		return "Rectangle [getLength()=" + getLength() + ", getWidth()=" + getWidth() + ", getArea()=" + getArea()
				+ ", getPerimeter()=" + getPerimeter() + ", getColor()=" + getColor() + ", getName()=" + getName()
				+ "]";
	}
	
	

	













}
