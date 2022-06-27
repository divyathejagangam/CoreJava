package divya.com;
import java.util.Scanner;
public class ReverseNum {

	public static void main(String[] args) {
		/*TODO reverse a number DIGITS COUNT*/
		ReverseNumber n1=new ReverseNumber();
		n1.inputData();
		n1.revNum();
		n1.displayData();
		n1.palindromeCheck();
		
}
}
class ReverseNumber{
	int num,temp;
	int rev=0,digit,i;
	
	void displayData(){
		System.out.println("Reverse number="+rev);
		System.out.println("No. of digits "+i);
	}
	void palindromeCheck() {
		if (temp==rev) {
			System.out.println("PALINDROME!!");
		}
		else {
			System.out.println("NOT A PALINDROME");
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
		i=i+1;
		rev=rev*10+digit;
	}
	
	
	
		
	}
	}

	