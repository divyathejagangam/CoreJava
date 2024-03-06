package coding.assessment;
import java.util.Scanner;

class CountDigits{
	
	 int num,temp,reverse=0;
	 int rem=0;
	 int count=0;

	CountDigits(int num){
		this.num=num;
	}
	
	
	public void ComputeDigit() {
		
		temp=num;
		int i=1;
		while(temp>0) {
		
		rem=temp%10;
		reverse=(reverse*10)+rem;
		count++;
		temp=temp/10;
		
	}
		System.out.println("The number of digits in the number are "+count);
		System.out.println("REVERSED NUMBER IS "+reverse);
	}
	
}

public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountDigits ob=new CountDigits(3456);
		ob.ComputeDigit();
	}

}
