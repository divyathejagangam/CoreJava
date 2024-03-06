package coding.assessment;
import java.util.Scanner;
class FindPrime{
	int num,count=0;
	public void inputData() {
		System.out.println("ENTER THE NUMBER TO BE CHECKED");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
	}
	
	public void checkPrime() {
		for(int i=2;i<(int)Math.sqrt(i);i++) {
			if(num%i==0) {
				count++;
				System.out.println("NOT A PRIME");
				break;
			}
			
		}
		
		if(count==0) {
			System.out.println("PRIME NUMBER");
		}
	}
	
}

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindPrime obj=new FindPrime();
		obj.inputData();
		obj.checkPrime();
	}
}
