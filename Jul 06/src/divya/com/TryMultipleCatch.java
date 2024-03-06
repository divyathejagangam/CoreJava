package divya.com;

//multiple try and catch block



public class TryMultipleCatch {

	public static void main(String[] args) {
		int a=10,b=2,c=0;
		int ar[]=new int[4];
		System.out.println("Before division");
		try {
		c=a/b; 
		ar[2]=98;
		System.out.println(ar[3]);
		
		}
		catch(ArithmeticException e) {
			System.out.println("catch will execute only when run time error occures");
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("finally block is optional");
			System.out.println("Finally executes always");
		}
		System.out.println("After division ");
	}
}
