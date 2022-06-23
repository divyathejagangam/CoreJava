package com.edu;

public class AreaOfFigures {

	public static void main(String[] args) {
		//Area of circle
		float pi=3.14f;
		double radius=11.5555;
		double area;
		area=pi*(radius*radius);
		System.out.println("The area of circle with radius "+radius+" is= "+area );
		//Area of rectangle and triangle
		int breadth=22;
		int length=10,rect_area;
		double tri_area;
		rect_area=breadth*length;
		System.out.println("The area of rectangle with length "+length+" and breadth "+breadth+" is= "+rect_area );
		tri_area=0.5*breadth*length;
		System.out.println("The area of rectangle with length "+length+" and breadth "+breadth+" is= "+tri_area );
		//Square area
		double side=10.2334,sq_area;
		sq_area=side*side;
		System.out.println("The area of square with side length "+side+" is="+sq_area );
		
	}

}
/Jun 16/

