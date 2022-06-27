package divya.com;
import java.util.Scanner;
public class WhileName {

	public static void main(String[] args) {
		// TO print name 10 times using while
		int i=1;
		String name;
		System.out.println("PLEASE ENTER YOUR NAME");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		while(i<=10) {
			System.out.println(name);
			i++;
		}

	}

}
