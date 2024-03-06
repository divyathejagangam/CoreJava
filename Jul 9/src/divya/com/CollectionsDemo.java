package divya.com;


import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsDemo {

	public static void main(String[] args) {
		//Dynamic array
		ArrayList<Integer> lob=new ArrayList<Integer>();
		lob.add(67);
		lob.add(65);
		lob.add(56);
		lob.add(59);
		
		//for display
		System.out.println("Integer "+lob);
		//for each //enhanced 
		for(int i:lob) { //for(datatype var_name: object_name)
			System.out.println(i);
		}
		
		//using iterator
		Iterator<Integer> intit=lob.iterator();
		while(intit.hasNext()) {
			System.out.println(intit.next());
		}
		
		ArrayList<Float> fob=new ArrayList<Float>();
		fob.add(78.5f);
		fob.add(76.5f);
		fob.add(56.5f);
		
		System.out.println("Float values ="+fob);
		
		for(float k:fob) {
			System.out.println(k);
		}
		
		//Using Iterator fetch the data
				Iterator<Float> it=fob.iterator(); //Iterator<datatype> identifier=arraylistobj.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
		
		ArrayList<Double> dob=new ArrayList<Double>();
		dob.add(67.3);
		dob.add(65.3);
		dob.add(87.3);
		System.out.println("Double value="+dob);
		
		for(double d:dob) {
			System.out.println(d);
		}
		
		
		Iterator<Double> dit=dob.iterator();
		while(dit.hasNext()) {
			System.out.println(dit.next());
		}
		
		ArrayList<String> sob=new ArrayList<String>();
		sob.add("Kiran");
		sob.add("Manoj");
		sob.add("Ravi");
		
		for(String s:sob) {
			System.out.println(s);
		}
		System.out.println("String values="+sob);
		
		
		
		
		
    }

}
