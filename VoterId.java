package divya.com;
import java.util.Scanner;

public class VoterId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		Scanner v=new Scanner(System.in);
		System.out.println("Enter the name ");
		name=v.nextLine();
		System.out.println("Enter age of "+name);
		age=v.nextInt();
		if (age>=18){
			System.out.println(name+" is elgible for voting");
		}
		else {
			System.out.println(name+" is not elgible for voting");
		}

	}

}
//
