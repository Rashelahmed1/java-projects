package com.lq.lab03;

public class Lab3 {
	public static void main(String[] args) {
	String daysOfWeek [] = new String [] { "Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
	
	String monthNames [] = new String [] {"January","February","March","April","May","June","July",
			"August","september","Auctober","November","December"};
	

	for(int i = 0; i < daysOfWeek.length  ; i ++) {
		System.out.print(daysOfWeek[i]+"\t");
	}

	System.out.println();
	for(int i = -4 ; i <= 31; i ++) {
		if(i < 1 ) {
			System.out.print("\t");
		}else {
			System.out.print(i+ "\t");
		}
		if(i == 2 || i == 9 || i == 16 || i == 23 || i == 30) {
			System.out.println();
		}
		
		
	}
	
	System.out.println("-----------------------------");
	for (String string : daysOfWeek) {
		System.out.println(string);
	}
	System.out.println("-----------------------------");
	for(int i = daysOfWeek.length -1; i > -1; i-- ) {
		
		System.out.println(daysOfWeek[i]);
		
		}
	System.out.println("-----------------------------");
	int i = 1;
	while (i <= 20) {
		i++;
		if (i % 2 == 0) {
			System.out.println(i);
		}
		else {
			continue;
		}
		
	}
}
}