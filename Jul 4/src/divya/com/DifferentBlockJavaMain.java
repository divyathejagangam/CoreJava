package divya.com;


		public class DifferentBlockJavaMain {
			
			static {
				System.out.println("Static block will execute before the main");
			}
			//Anonymous Block
			{
				System.out.println("Anonymous block this will execute before constructor");
			}
			DifferentBlockJavaMain(){
				System.out.println("This is constructor block");
			}
			
			
			public static void main(String[] args) {
				System.out.println("Main Method");
				DifferentBlockJavaMain ob=new DifferentBlockJavaMain();


	}

}
