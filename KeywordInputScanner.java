package divya.com;
import java.util.Scanner;
public class KeywordInputScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		float salary;
		System.out.println("ENTER YOUR NAME");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		System.out.println("ENTER YOUR AGE");
		Scanner ag=new Scanner(System.in);
		age=ag.nextInt();
		System.out.println("ENTER YOUR SALARY");
		Scanner sa=new Scanner(System.in);
		salary=sa.nextFloat();
		System.out.println("NAME: "+name);
		System.out.println("AGE: "+age);
		System.out.println("SALARY "+salary);
	}

}
