package divya.com;
import java.util.Scanner;
public class ElecBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int units;
		double bill=0;
		System.out.println("PLEASE ENTER THE NAME OF THE CUSTOMER");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		System.out.println("PLEASE ENTER THE UNITS CONSUMED");
		units=sc.nextInt();
		if (units<1) {
			System.out.println("INVALID INPUT FOR UNITS");
			//line 18 to terminate program
			System.exit(0);
		}
		else {
		if(units>=1 && units<=100) {
				bill=units*2.0f;
				
	}
		
	else if(units>100 && units<=300) {
		bill=(units*2.0f)+(units-100)*3.0f;
		

}
	else {
		bill=(units*2.0f)+(units-100)*3.0f+(units-300)*5.0f;
		bill=bill+(0.025*bill);
		

}
		System.out.println("NAME OF THE CUSTOMER: "+name);
		System.out.println("UNITS CONSUMED BY THE CUSTOMER: "+units);
		System.out.println("BILL TO BE PAID "+ bill);}
		
}}
