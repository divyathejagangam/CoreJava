package divya.com;
import java.util.Scanner;
class VowelFindSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letter;
		System.out.println("ENTER A LETTER");
		Scanner sc=new Scanner(System.in);
		letter=sc.next().charAt(0);
		sc.close();
		switch(letter) {
		case 'a'://System.out.println("THE ENTERED LETTER IS VOWEL a");
	
		case 'e'://System.out.println("THE ENTERED LETTER IS VOWEL e");
	
		
		case 'i'://System.out.println("THE ENTERED LETTER IS VOWEL i");
	
		
		case 'o'://System.out.println("THE ENTERED LETTER IS VOWEL o");

		case 'u'://System.out.println("THE ENTERED LETTER IS VOWEL u");
		
		case 'A'://System.out.println("THE ENTERED LETTER IS VOWEL A");

		case 'E'://System.out.println("THE ENTERED LETTER IS VOWEL E");
	
		
		case 'I'://System.out.println("THE ENTERED LETTER IS VOWEL I");
	
		
		case 'O'://System.out.println("THE ENTERED LETTER IS VOWEL O");
	
		case 'U':System.out.println("THE ENTERED LETTER IS VOWEL "+letter);
		break;
		default: System.out.println("ENTERED LETTER "+letter+" is a consonant");
		}
		
	}

}
