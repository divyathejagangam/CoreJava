package divya.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyFirstTestCase {

	@Test
	public void checkUser() {
		String user="divya";
		assertEquals(user, "divya1");
	}
	
	@Test
	public void add() {
		int s;
		int a=10, b=3;
		s=a+b;
	   assertEquals(11, s);
	}

	/*public static void main(String[] args) {
		MyFirstTestCase ob=new MyFirstTestCase();
		ob.checkUser();
		ob.add(2, 3);
	}*/
}
