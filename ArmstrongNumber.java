package divya.com;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmstrongCheck n1=new ArmstrongCheck();
		n1.inputData();
		n1.revNum();
		n1.displayData();
		n1.armstrongNum();
	}

}
class ArmstrongCheck{
	int num,temp,cube;
	int rev=0,digit,i;
	
	void displayData(){
		System.out.println("Reverse number="+rev);
		//System.out.println("No. of digits "+i);
	}
	
	void armstrongNum(){
		System.out.println(cube);
		if (temp==cube) {
			System.out.println("ARMSTRONG NUMBER");
		}
		else {
			System.out.println("NOT ARMSTRONG");
		}
	}
	
	void inputData() {
	System.out.println("ENTER A NUMBER");
    Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	}
	void revNum(){
		temp=num;
	while (num!=0)/*while num>0;*/{
		
		digit=num%10;
		num=num/10;
		//i=i+1;
		rev=rev*10+digit;
		cube=cube+(digit*digit*digit);
	}
	
	
	
		
	}
	}