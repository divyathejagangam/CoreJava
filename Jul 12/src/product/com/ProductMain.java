package product.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product(121, "TV", 56412);
		Product p2=new Product(1234, "Washing mc", 66412);
		Product p3=new Product(1235, "Fridge", 16412);
		
		ArrayList<Product> lst=new ArrayList<Product>();
		lst.add(p1);
		lst.add(p2);
		lst.add(p3);
		
		//Sort Product by price
		SortProductByPrice pr=new SortProductByPrice();
		
		Collections.sort(lst,pr);
		
		System.out.println("Sorting Based on price");
		Iterator<Product> pit=lst.iterator();
		System.out.println("PID\tPNAME\tPPRICE");
		while(pit.hasNext()) {
			Product pt=pit.next();
			System.out.println(pt.pid+"\t"+pt.pname+"\t"+pt.pprice);
		}
		
		//Sort Product by productid
				SortPidProduct pid=new SortPidProduct();
				
				Collections.sort(lst,pid);
				
				System.out.println("Sorting Based on Product id");
				Iterator<Product> sortpid=lst.iterator();
				System.out.println("PID\tPNAME\tPPRICE");
				while(sortpid.hasNext()) {
					Product pt=sortpid.next();
					System.out.println(pt.pid+"\t"+pt.pname+"\t"+pt.pprice);
				}
				//Sort product, by product name
				{
					SortByName pname=new SortByName();
					Collections.sort(lst,pname);
					Iterator<Product> sortpname=lst.iterator();
					System.out.println("PID\t\tPNAME\t\tPPRICE");
					while(sortpname.hasNext()) {
						Product p=sortpname.next();
						System.out.println(p.pid+"\t\t"+p.pname+"\t\t"+p.pprice);
					}
					
				}
	}
	
	
}












