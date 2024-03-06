package divya.com;

import java.util.Scanner;


		class Student{
			int sid;
			String sname;
			float sfees;
			public Student() {
				
			}
			public void input() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter name");
				sname=sc.nextLine();
				System.out.println("Enter fees");
		        sfees=sc.nextFloat();
		        System.out.println("Enter id");
		        sid=sc.nextInt();
				
			}
			public void display() {
				System.out.println("ID="+sid);
				System.out.println("Name="+sname);
				System.out.println("Fees="+sfees);
				
			}
			
		}

		public class ArrayObjectStudentMain {

			public static void main(String[] args) {
				//int ar[]=new int[5];
				//array for user defined datatype
				Student sob[]=new Student[5]; //sob[0],sob[1]......sob[4]
				
				for(int i=0;i<sob.length;i++) {
					sob[i]=new Student();
					
				}
				
				//input data
				for(int i=0;i<sob.length;i++) {
					sob[i].input();
				}
				
				//display
				System.out.println("All student records");
				for(int i=0;i<sob.length;i++) {
					sob[i].display();
				}
		}
				
			}

		

