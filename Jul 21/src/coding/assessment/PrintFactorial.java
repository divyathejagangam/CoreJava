package coding.assessment;

import java.util.Scanner;
class ComputeFactorial{
	double num,fact=1;
	public void InputData() {
		System.out.println("ENTER THE NUMBER TO FIND FACTORIAL");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
	}
	public void calculateFactorial() {
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("THE FACTORIAL IS "+fact);
	}
}


public class PrintFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputeFactorial ob=new ComputeFactorial();
		ob.InputData();
		ob.calculateFactorial();
	}

}
