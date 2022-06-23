package divya.com;

import java.util.Scanner;

public class LargestOfFour {

	public static void main(String[] args) {
		// LARGEST OF FOUR
		int first, second,third,fourth,large;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter four numbers");
		first = sc.nextInt();
		second = sc.nextInt();
		third =sc.nextInt();
		fourth=sc.nextInt();
		
		
		large = (first >= second && first >= third && first >= fourth)?first:(second >= first && second >= third && second>=fourth)?second:(third>=first && third>=second && third>=fourth)?third:fourth;

     System.out.println("Largest of "+first+", "+second+" , "+third+ " and"+ fourth+" is "+large);
	}

}
//
