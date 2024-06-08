package com.lq.lab06;

import com.lq.lab04.Box;

public class BoxDriverMain {

	public static void main(String[] args) {
		Box box1 = new Box( 5, 6, 7);
		Box box2 = new Box (10);
		
		System.out.println("Height = " +box1.getHeight());
		System.out.println("Length = "  +box1.getLength());
		System.out.println("SurfaceArea = " +box1.getSurfaceArea());
		System.out.println("Volume = " +box1.getVolume());
		System.out.println("Width = "  +box1.getWidth());
		System.out.println("---------------");
		System.out.println("Height = " +box2.getHeight());
		System.out.println("Length = "  +box2.getLength());
		System.out.println("SurfaceArea = " +box2.getSurfaceArea());
		System.out.println("Volume = " +box2.getVolume());
		System.out.println("Width = "  +box2.getWidth());
		System.out.println("---------------");
	
		
//		box1.PrintBox();
//		System.out.println("--------------");
//		box2.PrintBox();
//		System.out.println("--------------");

	
	box1.setLength(3);
	box1.setWidth(4);
	box1.setHeight(5);
	

	System.out.println("Height = " +box1.getHeight());
	System.out.println("Length = "  +box1.getLength());
	System.out.println("SurfaceArea = " +box1.getSurfaceArea());
	System.out.println("Volume = " +box1.getVolume());
	System.out.println("Width = "  +box1.getWidth());
	System.out.println("--------------");
	
	
	box1.PrintBox();
	System.out.println("--------------");
	box2.PrintBox();
	
	
	}

}
