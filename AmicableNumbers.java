package divya.com;
import java.util.Scanner;
public class AmicableNumbers {

	public static void main(String[] args) {
		/* amicable numbers-num1,num2: if: sum of factors of num1=num2 and sum of factors of num2=num1*/
		int n1,n2,sum1=0,sum2=0,f1,f2;
		System.out.println("ENTER NUMBER 1");
		Scanner sc= new Scanner(System.in);
		n1=sc.nextInt();
		System.out.println("ENTER NUMBER 2");
		Scanner y= new Scanner(System.in);
		n2=y.nextInt();
		f1=1;
		while (f1<n1) {
			if (n1%f1==0) {
				sum1 +=f1;
			}
			
			f1++;
		}
		f2=1;
		while (f2<n2) {
			if (n2%f2==0) {
				sum2 +=f2;
			}
			
			f2++;
		}
	
	if (n1==sum2 && n2==sum1) {
		System.out.println("AMICABLE NUMBERS");
	}
	else {
		System.out.println("NOT AMICABLE");
	}
}
}
