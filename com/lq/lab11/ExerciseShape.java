package com.lq.lab11;

public class ExerciseShape {

	public static void main(String[] args) {
		Shape s [] = new Shape[8];
		
		Shape r = new Rectangle(2.2,2.3,"Rose","Pink");
		Shape r1 = new Rectangle(2.2,2.3,"Rose","Red");
		
		Shape s1 = new Square(2.5);
		Shape s2 = new Square(2.6);
		
		Shape c = new Cube(2.7);
		Shape c1 = new Cube(2.8);
		
		Shape b = new Box(2.4,3.4,4.5);
		Shape b1 = new Box(2.4,3.4,4.5);
		
		
		s[0] =  r ;
		s[1] =  r1 ;
		s[2] =  s1 ;
		s[3] = s2 ;
		s[4] =  c ;
		s[5] =  c1 ;
		s[6] =  b ;
		s[7] =  b1 ;
		
		for (Shape shape : s) {
			shape.setColor("Red");
		}

		for (Shape shape : s) {
			
				if (shape instanceof ThreeDimensional) {
					ThreeDimensional temp = (ThreeDimensional)shape ;
					System.out.println(temp.getVolume());
				}
				
			
		}
		
	
	TwoDimensional td [] = new TwoDimensional[3];
	
	Circle cr = new Circle(2.5);
	
	Rectangle re = new Rectangle(2.2,2.3,"Rose","Pink");
	
	Square sq = new Square(3.6);
	
	
	td[0] = cr;
	td[1] = re;
	td[2] = sq;
	
	for (TwoDimensional twoDimensional : td) {
		System.out.println( twoDimensional.getArea());
		System.out.println( twoDimensional.getPerimeter());
	}
	
	
	
	
	
	}

}
