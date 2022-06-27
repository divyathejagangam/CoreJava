package divya.com;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num1=0,num2=1,num3;
		int term;
		num3=num1+num2;
		System.out.print("ENTER THE NUMBER OF TERMS REQUIRED TO PRINT ");
		Scanner sc=new Scanner(System.in);
		term=sc.nextInt();
		System.out.println(num1);
		System.out.println(num2);
		for(i=2;i<term;i++) {
			num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
			
		}
	}

}
