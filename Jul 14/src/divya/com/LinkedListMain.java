package divya.com;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListMain {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> lob=new LinkedList<Integer>();
		
		System.out.println("ENTER SIZE OF LINKED LIST");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=1;i<=num;i++) {
			Scanner sc1=new Scanner(System.in);
			lob.add(sc1.nextInt());
			
		}
		Iterator<Integer> it=lob.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
