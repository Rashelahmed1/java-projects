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
	System.out.println("-----------------------------");

	for(int x = 1 ; x <= 100 ; x++) {
		if(x > 49 && x <61 ) {
			continue;
		}
		else {
			System.out.println(x);
		}
		
	}
	System.out.println("-----------------------------");
	
	int x = 1;
	while(x <= 12) {
		System.out.println(x);
		
	switch (x) {
	case  1 :
	case 3 :
	case 5 :
	case 7 :
	case 8 :
	case 10 :
	case 12 :
	System.out.println(monthNames[x-1] +" = 31");
	break;
	case 2 :
		System.out.println(monthNames[x-1] +" = 28");
	break;

	case 4 :
	case 6 :
	case 9 :
	case 11 :
		System.out.println(monthNames[x-1] + " = 30");
	break;

	
	
}
	
	x++;
	}	
	
	
}
}