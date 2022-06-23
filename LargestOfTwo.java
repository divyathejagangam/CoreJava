package divya.com;

import java.util.Scanner;

public class LargestOfTwo 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int first, second,large;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers");
		first = sc.nextInt();
		second = sc.nextInt();
		
		//large = (first>second)?first:second;
		//System.out.println("Largest of "+first+" and "+second+" is "+large);
		
		//or using if else
		
		if(first > second) {
			System.out.println("Largest of "+first+" and "+second+" is "+first);
		}else {
			System.out.println("Largest of "+first+" and "+second+" is "+second);
	}
	} }

