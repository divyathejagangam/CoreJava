package divya.com;

import java.util.Scanner;

public class MarksRange {

	public static void main(String[] args) {
		// TO input grade of the student and obtain marks range
	
	char grade;
		
		System.out.println("Enter the grade");
		Scanner sc=new Scanner(System.in);
		grade=sc.next().charAt(0);
		if (grade=='A' || grade=='a') {
		System.out.println("Score between 80-100");
		}
		else if(grade=='B' || grade=='b') {
			System.out.println("Score between 60-79");
		}
	
		else if(grade=='C'||grade=='c') {
			System.out.println("Score between 35-59");
		}
		else if(grade=='F' || grade=='f')  {
			System.out.println("Student failed as he/she scored less than 35");
		}
		else {
			System.out.println("INVALID GRADE ENTERED");
		}

	}

}
