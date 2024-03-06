package divya.com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MyTestCase {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("before  class");
	}
	@Before
	public void beforeTest() {
		System.out.println("before each test");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("after  class");
	}
	@After
	public void afterTest() {
		System.out.println("after each test");
	}
	
	@Test
	public void test1() {
		int m,a,b;
		a=10;
		b=2;
		m=a*b;
		System.out.println("test1");
		assertEquals(20, 20);
		
	}
	@Test
	public void test2() {
		int m,a,b;
		a=10;
		b=2;
		m=a-b;
		System.out.println("test2");
		assertEquals(8, 8);
		
	}
	@Ignore
	public void testIgnore() {
		System.out.println("partial code, will not be executed");
	}
	@Test(expected= ArithmeticException.class)
	
	public void div () {
		
		int a=10,b=0;
		float c=a/b;
		
	}

	}


