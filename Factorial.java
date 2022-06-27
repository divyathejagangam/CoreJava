package divya.com;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int num,i;
				double fact=1;
				System.out.println("ENTER A NUMBER");
				Scanner sc=new Scanner(System.in);
				num=sc.nextInt();
				for(i=num;i>=1;i--) {
					fact=fact*i;
					
				}
		System.out.println("FACTORIAL"+fact);
			}

		

	}


