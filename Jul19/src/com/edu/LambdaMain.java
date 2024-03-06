package com.edu;
@FunctionalInterface
interface LambdaInterface{
	void myFunct();
	
	
}

/*class HelloClass implements LambdaInterface{

	@Override
	public void myFunct() {
		System.out.println("Hello Interface");
	}
	
}*/

public class LambdaMain {

	public static void main(String[] args) {
		
		/*HelloClass ob=new HelloClass();
		ob.myFunct();*/
		//Annonymous class
		LambdaInterface ob=new LambdaInterface() {
			
			@Override
			public void myFunct() {
				System.out.println("Hello Interface");
				
			}
		};
		ob.myFunct();
		
		//Lambda Expression : functional programming
		
		LambdaInterface ob1=()->{
			System.out.println("Interface function");
		};
		ob1.myFunct();
		
		Runnable rob=()->{
			System.out.println("run method is called");
		};
		Thread tob=new Thread(rob);
		tob.start();
	}

}
