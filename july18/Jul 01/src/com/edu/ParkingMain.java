/*
 Define a class named ParkingLot with the following description :
Instance variables/data members:
int vno — To store the vehicle number
int hours — To store the number of hours the vehicle is parked in the parking lot
double bill — Tb store the bill amount
Member methods:
void input( ) — To input and store the vno and hours.
void calculate( ) — To compute the parking charge at the rate of Rs.3 for the first hours or part thereof, and Rs. 1.50 for each additional hour or part thereof.
void display ( ) — To display the detail
Write a main method to create an object of the class and call the above methods.
*/
package com.edu;
import java.util.Scanner;
public class ParkingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParkingLot ob=new ParkingLot();
		ob.input();
		ob.calculate();
		ob.display();
		
	}

}
class ParkingLot {
	int vno,hours;
	double bill;
	void input() {
		System.out.println("ENTER THE VEHICLE NUMBER: ");
		Scanner sc=new Scanner(System.in);
		vno=sc.nextInt();
		System.out.println("ENTER THE NO. OF HOURS SPENT IN THE PARKING LOT");
		hours=sc.nextInt();
	}
	
	void calculate() {
		bill=3+(1.5*(hours-1));
	}
		void display() {
			System.out.println("VEHICLE NUMBER: "+vno);
			System.out.println("NO. OF HOURS PARKED: "+hours);
			System.out.println("TOTAL BILL GENERATED: "+bill);
		}
	
	}
