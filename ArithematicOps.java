package com.edu;

public class ArithematicOps {

	public static void main(String[] args) {
		int num1,num2,sum,product,subtract,reminder = 0;
		float quotient;
		num1=105;
		num2=22;
		//Addition of two numbers
		sum=num1+num2;
		System.out.println("The sum of"+num1+"and"+num2+"is ="+sum);
		//Subtraction of two numbers
		subtract=num1-num2;
		System.out.println("The difference of"+num1+"and"+num2+"is ="+subtract);
		//Product of two numbers
		product=num1*num2;
		System.out.println("The product of"+num1+"and"+num2+"is ="+product);
		//Quotient of two numbers
		quotient=(float)num1/num2;
		System.out.println("The quotient of"+num1+"and"+num2+"is ="+quotient);
		//Reminder of two numbers
		quotient=num1%num2;
		System.out.println("The reminder of"+num1+"and"+num2+"is ="+reminder);
	}

}
