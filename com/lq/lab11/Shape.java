package com.lq.lab11;

public abstract class Shape {

	private String color;
	private String name;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Shape [getColor()=" + getColor() + ", getName()=" + getName() + "]";
	}
	
	
	

}
