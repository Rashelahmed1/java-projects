package com.lq.lab12;

import com.lq.lab11.Box;
import com.lq.lab11.Cube;
import com.lq.lab11.Circle;
import com.lq.lab11.Rectangle;
import com.lq.lab11.Shape;
import com.lq.lab11.Square;

public class ExercisePrint {

	public static void main(String[] args) {
		
		Shape s[] = new Shape[5];
		
		Shape r = new Rectangle(2.2,2.3,"Rose","Purple");
		Shape s1 = new Square(4.5);
		Shape c1 = new Cube(4.6);
		Shape b = new Box(5.6,5.7,5.8);
		Shape c2 = new Circle(6.8);

	s[0] = r ;
	s[1] = s1 ;
	s[2] = c1 ;
	s[3] = b ;
	s[4] = c2 ;
	
	for (Shape shape : s) {
		System.out.println(shape);
	}
	
	
	
	
	}

}
