package com.edu;
import java.util.Scanner;
/*Design a class Railway Ticket with following description :
Instance variables/s data members :
String name : To store the name of the customer
String coach : To store the type of coach customer wants to travel
long mobno : To store customer’s mobile number
int amt : To store basic amount of ticket
int totalamt : To store the amount to be paid after updating the original amount

Member methods
void accept ( ) — To take input for name, coach, mobile number and amount
void update ( )— To update the amount as per the coach selected

Type of Coaches	  Amount
First_ AC	       700
Second_AC	       500
Third _AC	       250
sleeper	           None

void display( ) — To display all details of a customer such as name, coach, total amount and mobile number.
Write a main method to create an object of the class and call the above member methods.
*/
public class RailwayClassMain {

	public static void main(String[] args) {
		
		
		RailwayTickets ob=new RailwayTickets();
		ob.accept();
		ob.update();
		ob.display();
	}

}

class RailwayTickets{
	String name,coach;
	long mobno;
	int amt,totalamt;
	
	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NAME OF THE CUSTOMER");
		name=sc.next();
		Scanner mb=new Scanner(System.in);
		System.out.println("ENTER MOBILE No. OF THE CUSTOMER");
		mobno=mb.nextLong();
		System.out.println("ENTER THE TYPE OF COACH YOU CHOOSE");
		Scanner c=new Scanner(System.in);
		coach=c.next();
		System.out.println("ENTER BASE AMOUNT");
		Scanner am=new Scanner(System.in);
		amt=am.nextInt();
	}
	
	void update() {
		if(coach.equalsIgnoreCase("First_AC")) {
			totalamt=amt+700;
			System.out.println(totalamt);
		}
		else if(coach.equalsIgnoreCase("Second_AC")) {
			totalamt=amt+500;
			System.out.println(totalamt);
		}
		else if(coach.equalsIgnoreCase("Third_AC")) {
			totalamt=amt+250;
			System.out.println(totalamt);
		}
		else if(coach.equalsIgnoreCase("sleeper")) {
			totalamt=amt;
			System.out.println(totalamt);
		}
		else {
			System.out.println("INCORRECT COACH NUMBER");
		}
	}
	
	void display() {
		System.out.println("CUSTOMER NAME: "+name);
		System.out.println("MOBILE NUMBER: "+mobno);
		System.out.println("COACH TYPE: "+coach);
		System.out.println("TOTAL PAYABLE AMOUNT: "+totalamt);
	}
	
	
	
}
