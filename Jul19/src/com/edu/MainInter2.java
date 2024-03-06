package com.edu;
//functional interface Lambda expn with arg
@FunctionalInterface
interface CallInter{
	void myCallMethod(String s);
}

public class MainInter2 {

	public static void main(String[] args) {
		//using lambda expression
		CallInter mob=(s)->
		System.out.println("Hello functional interface "+s);
	
		mob.myCallMethod("Hello");
	}

}

