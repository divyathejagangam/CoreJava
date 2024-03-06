package coding.assessment;
import java.util.Scanner;

class ComputeLargest{
	int num1;
	int num2;
	public void InputData() {
		System.out.println("Enter the two numbers");
		Scanner sc=new Scanner(System.in);
		 num1=sc.nextInt();
		num2=sc.nextInt();
		
	}
	
	public void ComputeLargest() {
		/*
		int result=(num1>num2)?num1:num2;
		System.out.println("THE LARGEST OF "+num1+" and "+num2+" IS "+result);
		*/
		
		if (num1>num2) {
			System.out.println("THE LARGEST OF "+num1+" and "+num2+" IS "+num1);
		}
		else {
			System.out.println("THE LARGEST OF "+num1+" and "+num2+" IS "+num2);
		}
	}
}

public class LargestOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputeLargest ob=new ComputeLargest();
		ob.InputData();
		ob.ComputeLargest();
	}

}
