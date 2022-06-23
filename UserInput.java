package divya.com;
import java.util.Scanner;


public class UserInput {

	public static void main(String[] args) {
		//declaration of variables
				String name;
				int age;
				float fees;
				double amount;
				char gen;
		      //create an Object
				//System.in->input device(Keyword)
				Scanner sc = new Scanner(System.in);//Scanner class , sc->user defined object
				//int ->nextInt(), float->nextFloat(), double->nextDouble()d
				//long->nextLong()
				//String name=next()->read word
				//String with the space nextLine()
				//char ->next().charAt(0);
				
				//System.out(Monitor) display purpose
				
				System.out.println("Enter name"); //System->class out->object  println->function
				name=sc.nextLine();
				System.out.println("Enter age");
				age = sc.nextInt();
				System.out.println("Enter fees");
				fees = sc.nextFloat();
				System.out.println("Enter total amount");
				amount = sc.nextDouble();
				System.out.println("Enter gender m/f");
				gen=sc.next().charAt(0);

	}}
