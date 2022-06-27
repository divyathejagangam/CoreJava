package divya.com;
import java.util.Scanner;
public class Grades {

	public static void main(String[] args) {
		// TODO the below prog using else if ladder
		/*Input                       output
  marks 		Grade
80-100		grade A
60-79                       grade B
35-59                       grade C
0-34                           Fail
marks is >100 and <0      display invalid input
*/
		int marks;
		
		System.out.println("Enter the marks");
		Scanner sc=new Scanner(System.in);
		marks=sc.nextInt();
		if (marks<0 || marks>100) {
		System.out.println("INVALID INPUT");
		}
		else if(marks>=80 && marks<=100) {
			System.out.println("GRADE A");
		}
		else if(marks>=60 && marks<=79) {
			System.out.println("GRADE B");
		}
		else if(marks>=35 && marks<=59) {
			System.out.println("GRADE C");
		}
		else  {
			System.out.println("FAIL");
		}
	}
}

	
