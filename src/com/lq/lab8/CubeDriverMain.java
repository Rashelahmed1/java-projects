package com.lq.lab8;

public class CubeDriverMain {

	public static void main(String[] args) {
		Cube cube1 = new Cube(5);
		Cube cube2 = new Cube(6);
		
		System.out.println(cube1.getHeight());
		System.out.println(cube1.getLength());
		System.out.println(cube1.getSide());
		System.out.println(cube1.getSurfaceArea());
		System.out.println(cube1.getVolume());
		System.out.println(cube1.getWidth());
		System.out.println("--------------");
		
		System.out.println(cube2.getHeight());
		System.out.println(cube2.getLength());
		System.out.println(cube2.getSide());
		System.out.println(cube2.getSurfaceArea());
		System.out.println(cube2.getVolume());
		System.out.println(cube2.getWidth());
		System.out.println();
	
	cube1.setLength(20);
	
	System.out.println(cube1.getLength());
	System.out.println(cube1.getHeight());
	System.out.println(cube1.getWidth());
	System.out.println(cube1.getSide());
	System.out.println(cube1.getSurfaceArea());
	System.out.println(cube1.getVolume());
	
	cube2.setSide(40);
	System.out.println(cube2.getLength());
	System.out.println(cube2.getHeight());
	System.out.println(cube2.getWidth());
	System.out.println(cube2.getSide());
	System.out.println(cube2.getSurfaceArea());
	System.out.println(cube2.getVolume());
	
	System.out.println();
	cube2.setWidth(-5);
	cube2.PrintBox();
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
