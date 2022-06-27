package divya.com;
import java.util.Scanner;
public class PrimeNumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				Scanner sc = new Scanner(System.in);
				int num,  c=0;
				System.out.println("enter a number to find Prime");
				num = sc.nextInt();
				
				/*for(int i=1;i<=num;i++) {
					if(num%i==0) {  //7  1 and 7
						c++;
					}
				}
				if(c==2) {
					System.out.println(num+" is prime number");
				}
				else {
					System.out.println(num+" is not a prime");
				}*/
				boolean prime=true;
				for(int i=2;i<num;i++) {
					if(num%i==0) {
						prime=false;
						break;
					}
				}
				if(prime) {
					System.out.println(num+" is prime");
				}else {
					System.out.println(num+" is not a prime");
				}
			}

		}

	
