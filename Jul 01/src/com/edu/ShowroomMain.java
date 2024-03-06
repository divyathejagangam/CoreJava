package com.edu;
import java.util.Scanner;

public class ShowroomMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiscountClass ob=new DiscountClass();
		ob.showRoom();
		ob.input();
		ob.calculate();
		ob.display();
	}

}
class DiscountClass{
	String name;
	long mobno;
	double cost,dis,amt;
	
	void showRoom() {
		name="";
		mobno=0;
		cost=0.0;
		dis=0.0;
		amt=0.0;
	}
	void input() {
		System.out.println("CUSTOMER NAME: ");
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		System.out.println("COST OF THE ITEM PURCHASED: ");
		Scanner c=new Scanner(System.in);
		cost=c.nextDouble();
		System.out.println("CUSTOMER MOBILE NUMBER: ");
		Scanner m=new Scanner(System.in);
		mobno=m.nextLong();
		
	}
	
	void calculate() {
		if(cost<=0) {
			System.out.println("INVALID INPUT!!");
		}
		
	else if (cost<=10000) {
			amt=cost-(0.05*cost);
		}
		else if(cost>10000 && cost<=20000) {
			amt=cost-(0.1*cost);
			
		}
		else if(cost>20000 && cost<=35000) {
			amt=cost-(0.15*cost);
			
		}
		else if(cost>35000) {
			amt=cost-(0.2*cost);
			
		}
		
	}
	
	void display()
	{
		
		System.out.println("CUSTOMER NAME: "+name);
		System.out.println("CUSTOMER MOBILE NUMBER: "+mobno);
		System.out.println("COST OF THE ITEM: "+cost);
		System.out.println("AMOUNT TO BE PAID AFTER DISCOUNT: "+amt);
	}	
	
	
	
}
