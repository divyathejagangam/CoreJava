package com.divya;

import java.util.function.Predicate;

public class MainPredicate {

	public static void main(String[] args) {
		//Predicate
		System.out.println("Predicate Example");
		
		Predicate<Integer> pob=(i)->(i>10);
		boolean val=pob.test(12);
		System.out.println("return value="+val);
	}

}
