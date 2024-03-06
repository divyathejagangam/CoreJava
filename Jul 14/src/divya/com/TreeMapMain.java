package divya.com;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String> tb=new TreeMap<String,String>();
		System.out.println("ETNER THE NUMBER OF ENTRIES TO BE MADE");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Enter the details");
		for (int i=0;i<num;i++) {
			String ph=sc.next();
			String nm=sc.next();
			tb.put(ph, nm);
			
		}
		
		for(Map.Entry<String, String> tob:tb.entrySet()) {
			System.out.println(tob.getKey()+ "\t"+tob.getValue());
		}
	}

}
