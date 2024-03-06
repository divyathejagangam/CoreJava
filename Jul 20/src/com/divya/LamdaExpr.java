package com.divya;

interface Myinterface{
	
	int addn(int a,int b);
}
class MyClass implements Myinterface{

	@Override
	public int addn(int a, int b) {
		// TODO Auto-generated method stub
		return (a+b);
	}
	
}

public class LamdaExpr {

	public static void main(String[] args) {
		Myinterface aob=(int i,int j)->{
		int s=i+j;
		return s;
		};
		System.out.println("sum="+aob.addn(9, 7));
		
		Runnable r=()->{
			System.out.println("inside run");
		};
		Thread tob=new Thread(r);
		tob.start();
		
		MyClass ob=new MyClass();
		ob.addn(5, 7);
		
		
		Myinterface iob=new Myinterface() {
			
			@Override
			public int addn(int a, int b) {
				// TODO Auto-generated method stub
				return (a+b);
			}
		};
		
		System.out.println("s="+iob.addn(3, 8));
	}
	
	
	
}
