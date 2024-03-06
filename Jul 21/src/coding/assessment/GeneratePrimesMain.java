package coding.assessment;
import java.util.Scanner;

class GeneratePrimes{
	int num,flag=0;
	
	public void inputData() {
		System.out.println("Enter the number till which the prime numbers are to be generated");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
	}
	
	public void generatePrime() {
		System.out.println("PRIME NUMBERS FROM 1 TO "+num+" are ");
		System.out.println(2);
		for(int i=3;i<=num;i+=2) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag++;
				}
			}
			if(flag==0) {
			System.out.println(i);
		}
			
		}
	}
	
}

public class GeneratePrimesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeneratePrimes ob=new GeneratePrimes();
		ob.inputData();
		ob.generatePrime();
	}

}
