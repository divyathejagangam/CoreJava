package divya.com;
import java.util.Scanner;
class Student{
	int sid;
	String sname;
	float sfees;
	
	void inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		sname=sc.nextLine();
		System.out.println("Enter id");
		sid = sc.nextInt();
		System.out.println("Enter fees");
		sfees = sc.nextFloat();
		
	}
	void displayData() {
		System.out.println("Name="+sname);
		System.out.println("Id="+sid);
		System.out.println("Fees="+sfees);
	}
	
}


public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(); //s1 and s2 are objects 
		s1.inputData();
		s1.displayData();
		Student s2=new Student();
		s2.inputData();
		s2.displayData();
		System.out.println("s1 ref "+s1);//for knowing location stored
		System.out.println("name="+s1.sname +"id="+s1.sid+" fees="+s1.sfees);
		System.out.println("s2 ref "+s2);
	}

}
