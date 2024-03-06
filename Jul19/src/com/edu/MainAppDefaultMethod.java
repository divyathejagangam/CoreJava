package com.edu;
interface MyInterface{
	void funct(); //public abstract
	 default void displayInterface(){
		System.out.println("Default method in interface");
	}
	 
	 static void staticMethodInterface(){
		 System.out.println("static method in interface");
	 }
}

class MyClass implements MyInterface{

	@Override
	public void funct() {
		System.out.println("interface abstract method");
		
	}
}

public class MainAppDefaultMethod {

	public static void main(String[] args) {
		MyClass ob=new MyClass();
		ob.displayInterface();
		ob.funct();
		MyInterface.staticMethodInterface();

	}

}
