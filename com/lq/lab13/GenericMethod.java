package com.lq.lab13;



public class GenericMethod {
    public static <E> void printArray(E inputArray[]) {
        
    	for (E e : inputArray) {
			System.out.println(e);
		}
    	
    	
    }
}
