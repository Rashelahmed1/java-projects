package com.lq.lab13;

public class GenericBoxExerciser {

	public static void main(String[] args) {
		
		GenericBox<Integer> g  = new GenericBox<>();
		GenericBox<String> g1  = new GenericBox<>();
		
		g.setT(10);
		g1.setT("Hello World");
		
		System.out.println(g.getT());
		System.out.println(g1.getT());
		
		
		
		
		
		
		
		
	
	}
	
}
