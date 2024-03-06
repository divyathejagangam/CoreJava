package divya.com;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>tob=new TreeSet<String>();
		System.out.println("ENTER NUMBER OF ELEMENTS OF TREE SET");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			Scanner sc1=new Scanner(System.in);
			tob.add(sc1.next());
		}
		Iterator<String> it=tob.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
