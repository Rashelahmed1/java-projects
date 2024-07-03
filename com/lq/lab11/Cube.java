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

	@Override
	public double getHeight() {
		// TODO Auto-generated method stub
		return getSide();
	}

	@Override
	public void setHeight(double side) {
		// TODO Auto-generated method stub
		super.setHeight(side);
		super.setLength(side);
		super.setWidth(side);
	}

	@Override
	public double getWidth() {
		// TODO Auto-generated method stub
		return getSide();
	}

	@Override
	public void setWidth(double side) {
		// TODO Auto-generated method stub
		super.setWidth(side);
		super .setLength(side);
		super.setHeight(side);
	}

	@Override
	public double getLength() {
		// TODO Auto-generated method stub
		return getSide();
	}

	@Override
	public void setLength(double side) {
		// TODO Auto-generated method stub
		super.setLength(side);
		super.setWidth(side);
		super.setHeight(side);
	}

	@Override
	public String toString() {
		return "Cube [getSide()=" + getSide() + ", getHeight()=" + getHeight() + ", getWidth()=" + getWidth()
				+ ", getLength()=" + getLength() + ", getVolume()=" + getVolume() + ", getSurfaceArea()="
				+ getSurfaceArea() + ", getColor()=" + getColor() + ", getName()=" + getName() + "]";
	}

	


	














}
