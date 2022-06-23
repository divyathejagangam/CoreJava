package divya.com;
import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using ternary operator ?: it is a replacement of if else
		//Program to find the largest of two numbers 
		
					int first, second,third,large;
					
					Scanner sc = new Scanner(System.in);
					
					System.out.println("Enter three numbers");
					first = sc.nextInt();
					second = sc.nextInt();
					third =sc.nextInt();
					
					large = (first >= second && first >= third)?first:(second >= first && second >= third)?second:third;

			     System.out.println("Largest of "+first+", "+second+" and "+third+" is "+large);
			     
			     
			}


				}
			
			

		
//
	
