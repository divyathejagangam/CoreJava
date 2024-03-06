package com.edu;

class DefSeries{
	
	void series(int x,int n) {
		int pow=1;
		int sum=0;
		for(int i=1;i<=n;i++) {
			pow=1;
			for(int j=1;j<=i;j++) {
				pow=pow*x;
			}
			sum=sum+pow;
		}	
		
		System.out.println(sum);
		
	}
	
	void series(int p)
	{
		for(int i=1;i<=p;i++) {
			System.out.print(" "+( i*i*i-1));
		}
	}
	
	void series() {
		double sum=0;
		for(double i=1;i<=10;i++) {
			sum=sum+(1/i);
		}
		System.out.println();
		System.out.println(sum);
	}
}

public class MethodOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefSeries ob=new DefSeries();
		ob.series(2, 3);
		ob.series(5);
		ob.series();
	}

}
