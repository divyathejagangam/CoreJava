package divya.com;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner ch=new Scanner(System.in);
		System.out.println("Enter any number");
		num=ch.nextInt();
		
	
		if (num%2==0) {
			System.out.println("Number "+num+ " is an even integer");
		}
		
		else {
			System.out.println("Number "+num+ " is an odd integer");
		}



	}

}
