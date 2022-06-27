package divya.com;
import java.util.Scanner;
public class LargestOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		System.out.println("ENTER A NUMBER");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		System.out.println("ENTER ANOTHER NUMBER");
		Scanner n=new Scanner(System.in);
		num2=n.nextInt();
		if (num1>num2) {
			System.out.println("The largest of two numbers is "+num1);
		}
		else {
			System.out.println("The largest of Two numbers is "+num2);
		}
	}

}
