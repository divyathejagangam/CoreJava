
//Using idf else and say even or odd
package divya.com;
import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		int num;
		Scanner ch=new Scanner(System.in);
		System.out.println("Enter any number");
		num=ch.nextInt();
		if (num==0){
			System.out.println("The given number "+ num +" is equal to zero");
		}
		if (num>0) {
			System.out.println("The given number "+ num +" is greater than zero");
		}
		
		
		else {
			if (num<0) {
			System.out.println("The given number "+ num +" is less than zero");
		}
		
		
		
		
		
	}

	}}
