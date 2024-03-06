package divya.com;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String args[]) {
		//Dynamic Array
		ArrayList<Integer> iob=new ArrayList<Integer>();
		iob.add(23);
		iob.add(33);
		iob.add(22);
		System.out.println("Integer "+iob);
		//for each //enhanced 
		for(int i:iob) {
			System.out.println(i);
		}
		
		ArrayList<Float> fob=new ArrayList<Float>();
		fob.add(78.5f);
		fob.add(76.5f);
		fob.add(56.5f);
		
		System.out.println("Float values ="+fob);
		
		for(float k:fob) {
			System.out.println(k);
		}
		
		ArrayList<Double> dob=new ArrayList<Double>();
		dob.add(67.3);
		dob.add(65.3);
		dob.add(87.3);
		System.out.println("Double value="+dob);
		for(Double d:dob) {
			System.out.println(d);
		}
		
		ArrayList<String> sob=new ArrayList<String>();
		sob.add("alexa");
		sob.add("bob");
		sob.add("siri");
		
		System.out.println("String values="+sob);
		for(String s:sob) {
			System.out.println(s);
		}

		
	}

}
