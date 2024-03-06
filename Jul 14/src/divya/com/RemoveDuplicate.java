package divya.com;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>ls=new ArrayList<Integer>();
		ls.add(1);
		ls.add(2);
		ls.add(1);
		ls.add(2);
		ls.add(1);
		ls.add(7);
		
		
		TreeSet<Integer>ts=new TreeSet<Integer>();
		
		Iterator<Integer>it=ls.iterator();
		while(it.hasNext())
		
			{
			ts.add(it.next());
			}
		Iterator<Integer>itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
			}
		

	}


