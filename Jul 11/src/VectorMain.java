

//add, remove,addAll,contains, containsAll,indexOf


import java.util.Vector;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class VectorMain {

	public static void main(String[] args) {
		Vector<String> lob=new Vector<String>();
		lob.add("neha");
		lob.add("Divya");
		lob.add("Gopal");
		lob.add("Avaneesh");
		System.out.println(lob);
		lob.remove(2);
		System.out.println(lob);
		Vector<String> lob1=new Vector<String>();
		lob1.add("one");
		lob1.add("two");
		lob.addAll(lob1);
		lob1.add("three");
		System.out.println(lob);
		System.out.println("Neha is present "+lob.contains("neha"));
		System.out.println(lob.containsAll(lob1));
		System.out.println(lob.indexOf("Divya"));
		
		//Iterate elements using Iterator
		Iterator<String> it=lob.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//using for-each or enhanced for
		
		for(String s:lob) {
			System.out.println(s);
		}
		
		//Sorting
		Collections.sort(lob);
		System.out.println("Sorted elements");
		System.out.println(lob);
		
		Collections.shuffle(lob);
		System.out.println("After shuffle "+lob);
		
		Collections.swap(lob,1, 3);
		System.out.println("after swap "+lob);
	}
}


