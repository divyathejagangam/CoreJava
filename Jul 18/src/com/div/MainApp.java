package com.div;

class Bank{
	int amount;
	Bank(){
		amount=1000;
	}
	
	synchronized void withDraw(int wamount) throws InterruptedException {
		if(wamount>amount) {
			System.out.println("Insufficient Balance");
			System.out.println("First deposit the amount");
			wait(); //control
		}
			amount=amount-wamount;
			System.out.println("balance amount="+amount);
		
	}
 synchronized void deposit(int damount) {
		amount=amount+damount;
		System.out.println("Your amount after deposit "+amount);
		notify();
	}
}


public class MainApp {
	public static void main(String[] args) {
		Bank bob=new Bank();
		new Thread() {
			public void run() {
				try {
					bob.withDraw(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		//t1.start();
		
		Thread t2=new Thread() {
			public void run() {
				bob.deposit(2000);
			}
		};
		t2.start();
	}

}

