package divya.com;
import java.util.Scanner;
public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3,largest;
		boolean flag=true;
		System.out.println("ENTER A NUMBER");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		System.out.println("ENTER ANOTHER NUMBER");
		Scanner n=new Scanner(System.in);
		num2=n.nextInt();
		System.out.println("ENTER THE THIRD NUMBER");
		Scanner a=new Scanner(System.in);
		num3=a.nextInt();
		//largest=(num1>=num2 && num1>=num3)?num1:(num2>=num1 && num2>=num3)?num2:num3;
		largest = num1;
		if (num2>largest) {
			largest=num2;
			
		}
		if(num3>largest) {
			largest = num3;
		}
			System.out.println("The largest of three numbers is "+largest);
		}
	}


