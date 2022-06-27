package divya.com;
import java.util.Scanner;
public class EvenOddSwitchMain {

	public static void main(String[] args) {
		int num,remainder;
			System.out.println("ENTER THE NUMBER");
			Scanner sc=new Scanner(System.in);
			num=sc.nextInt();
			remainder=num%2;
		// TODO Auto-generated method stub
			switch(num%2) {
			case 0: System.out.println("The entered number "+num+" IS EVEN NUMBER");
			break;
			
			case 1: System.out.println("The entered number "+num+" IS ODD NUMBER");
			
			}
	}

}

