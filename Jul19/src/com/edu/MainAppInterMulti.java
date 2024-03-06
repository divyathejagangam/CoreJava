package com.edu;
interface Myintface1
{
	void method1();
	default void message1() {
		System.out.println("Myinterface1");
	}
}
interface Myintface2
{
	void method2();
	default void message2() {
		System.out.println("Myinterface2");
	}
}

class MessageClass implements Myintface1,Myintface2{

	@Override
	public void method2() {
		System.out.println("method1");
		
	}

	@Override
	public void method1() {
		System.out.println("method1");
		
	}

}
public class MainAppInterMulti {

	public static void main(String[] args) {
		
		MessageClass ob=new MessageClass();
		ob.message1();
		ob.message2();
		ob.method1();
		ob.method2();
	}

}
