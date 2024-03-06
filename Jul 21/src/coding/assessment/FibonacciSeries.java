package coding.assessment;

import java.util.Scanner;

class ComputeFibonacci{
	int num1,num2,tot,sum;
	public void inputData() {
		System.out.println("Enter num1 value");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		System.out.println("Enter num1 value");
		num2=sc.nextInt();
		System.out.println("ENTER THE NO OF ELEMENTS REQ IN THE SERIES");
		tot=sc.nextInt();
	}
	public void calcFibonacci() {
		System.out.println(num1);
		System.out.println(num2);
		for(int i=1;i<=tot-2;i++) {
		sum=num1+num2;
		System.out.println(sum);
		num1=num2;
		num2=sum;
	}
	}
	
}


public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputeFibonacci ob=new ComputeFibonacci();
		ob.inputData();
		ob.calcFibonacci();
	}
}