package divya.com;

//multiple try and catch block
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CheckedExceptionMalin {

	public static void main(String[] args) throws IOException  {
		//IO Exception ->Checked Exception
		int age;
		String name1; //firstname and lastme 
		float fees;
		
		
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		
		System.out.println("Enter name");
		name1=br.readLine();  //readLine->String
		System.out.println("Enter age");
		age = Integer.parseInt(br.readLine());   //"12"
		System.out.println("Enter fees");
		fees=Float.parseFloat(br.readLine());
		
		System.out.println("Name= "+name1);
		System.out.println("Age= "+age);
		System.out.println("Fees= "+fees);
		
		
		
		
	}
}





