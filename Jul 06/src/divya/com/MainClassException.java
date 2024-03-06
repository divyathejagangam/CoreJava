package divya.com;
public class MainClassException {

	public static void main(String[] args) {
		int a=10,b=0,c=0;
		System.out.println("Before division");
		try {
		c=a/b; 
		}
		catch(ArithmeticException e) {
			System.out.println("catch will execute only when run time error occures");
			e.printStackTrace();
		}
		System.out.println("After division "+c);
	}
}

