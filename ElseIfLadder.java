package divya.com;
import java.util.Scanner;

public class ElseIfLadder {

	public static void main(String[] args) {
		// TODO Largest of three usinf else-if ladder

		int first, second, third;
		
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter 3 numbers");
        first = sc.nextInt();
        second = sc.nextInt();
        third = sc.nextInt();
        
        if(first >= second && first >= third) {
        	System.out.println("The largest of "+first+" ,"+second+" and "+third+" is "+first);
        }
        else if(second >= first && second >= third) {
        	System.out.println("The largest of "+first+" ,"+second+" and "+third+" is "+second);
        }
        else {
        	System.out.println("The largest of "+first+" ,"+second+" and "+third+" is "+third);
        }
        

	}

}
