package com.edu;

public class VolumeMain {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		 * Design a class to overload a function volume() as follows : 
(i) double volume (double R) — with radius (R) as an argument, returns the volume of sphere using the formula.
V = 4/3 × 22/7 × R3
(ii) double volume (double H, double R) – with height(H) and radius(R) as the arguments, returns the volume of a cylinder using the formula.
V = 22/7 × R2 × H
(iii) double volume (double L, double B, double H) – with length(L), breadth(B) and Height(H) as the arguments, returns the volume of a cuboid using the formula.
L*B*H

		 */
		
		VolumeOverload ob=new VolumeOverload();
		ob.volume(3, 4, 5);
		ob.volume(3.1);
		System.out.println("Volume of Cylinder"+ob.volume(3, 4));
	}

}

class VolumeOverload{
	double volume(double r) {
		double v=(4/3)*(22/7)*r*r*r;
		System.out.println("Volume of sphere "+v);
		return v;
	}
	double volume(double h,double r) {
		double v;
		v=(22/7)*r*r*h;
		return v;
	}
	double volume(double l, double b, double h) {
		System.out.println("Volume of cuboid"+(l*b*h));
		return l*b*h;
	}
}
