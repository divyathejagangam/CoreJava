package product.com;

import java.util.Comparator;

public class SortProductByPrice implements Comparator<Product>{
	@Override
	public int compare(Product o1, Product o2) {
		
		if(o1.pprice==o2.pprice)
		return 0;
		else if(o1.pprice>o2.pprice)
			return 1;
		else
			return -1;
	}
}
