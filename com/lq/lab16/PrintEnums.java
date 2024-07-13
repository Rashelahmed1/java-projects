package com.lq.lab16;

public class PrintEnums {

	public static void main(String[] args) {
		for (TirePressures x : TirePressures.values()) {
			System.out.println(x.getName());
			System.out.println(x.getPresure());
		}

	}

}
