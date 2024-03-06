package divya.com;


public class DivideByZeroMain {

	public static void main(String[] args) {
		int a=1,b=1;
		try {
		if(a<0 || b<0) {
			ArithmeticException eb=new ArithmeticException("Either one value is negative");
		   throw eb;
		
		}
		else {
			System.out.println("They are positive");
		}
		}catch(ArithmeticException e) {
			e.printStackTrace();
			
		}
	
	}

}
