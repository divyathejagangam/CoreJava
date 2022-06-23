package divya.com;
import java.util.Scanner;
public class VowelFind {

	public static void main(String[] args) {
		// TO find if a given character is a vowel
		
		char letter;
		String vowel;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER A SINGLE ALPHABET IN LOWER CASE");
		letter=sc.next().charAt(0);
		vowel = (letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u'||letter=='A' || letter=='E' || letter=='I' || letter=='O' || letter=='U')?"A VOWEL" :"A CONSONANT";
		System.out.println("Letter "+letter+ " is "+ vowel);
	}
	
	

}
//
