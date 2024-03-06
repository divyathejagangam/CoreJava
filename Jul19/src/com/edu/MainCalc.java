package com.edu;
@FunctionalInterface
interface AddInt{
	
	int add(int i,int j);
}


@FunctionalInterface
interface SubInt{
	

	int sub(int i,int j);
}

@FunctionalInterface
interface MulInt{
	int sub(int i,int j);
}


public class MainCalc {

	public static void main(String[] args) {
		
		SubInt sob=(i,j)->i-j;
		System.out.println("Difference "+sob.sub(5,4));
		
		AddInt aob=(i,j)->i+j;
		System.out.println("SUM "+aob.add(5, 6));
	}

}
