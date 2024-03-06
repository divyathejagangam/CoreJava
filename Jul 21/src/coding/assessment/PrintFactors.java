package coding.assessment;
import java.util.Scanner;

public class PrintFactors {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		System.out.println("ENTER A NUMBER");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println( i);
			}
		}
				
			
		}
}
		
	


