package divya.com;
import java.util.Scanner;
public class InputUserPassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidateUser ob=new ValidateUser();
		ob.validateData();
		ob.checkData();
	}

}

class ValidateUser{
	String username,password;
	void validateData() {
	try {
	System.out.println("Enter the username");
	Scanner sc=new Scanner(System.in);
	username=sc.next();
	System.out.println("Ether the passcode to validate acct");
	Scanner p=new Scanner(System.in);
	password=p.next();
	}
	catch(NumberFormatException  | NullPointerException e){
		e.printStackTrace();
	}
	}
	void checkData () {
		if (username.equalsIgnoreCase("Admin") && password.equals("admin123")) {
			System.out.println("VALIDATING USER INPUT ...");
		}
		else {
			System.out.println("INVALID INPUT");
		}
	}
}
