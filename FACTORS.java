package divya.com;

import java.util.Scanner;

public class FACTORS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,factor;
		System.out.println("ENTER A NUMBER ");
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		
		factor=1;
		while (factor<=num) {
			if (num%factor==0) {
				System.out.println(factor);
			}
			
			factor++;
		}
	}

}
