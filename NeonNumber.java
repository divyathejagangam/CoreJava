package divya.com;
import java.util.Scanner;
public class NeonNumber {

	public static void main(String[] args) {
		// 9^2=81==>8+1=9===> neon number
		NumberTest n1=new NumberTest();
		n1.inputData();
		n1.CalculateNum();
		n1.displayOutput();
	}

}
class NumberTest{
	
	int num,temp,digit,square,sum;
	void displayOutput() {
		if (num==sum) {
			System.out.println("NEON NUMBER ");
		}
		else {
		System.out.println("NOT A NEON NUMBER");
		}
	}
	void inputData() {
		System.out.println("PLEASE ENTER A NUMBER");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
	}
	void CalculateNum() {
		square=num*num;
		temp=square;
		while (temp>0){
		digit=temp%10;
		temp=temp/10;
		sum=sum+digit;
		}
	}
	
}
