package div.com;
class PrintTable{
	 synchronized void displayMultTable(int n) { //lock
		for(int i=1;i<=10;i++) {
			System.out.println(n+"x"+i+"="+n*i);
		}
	}
}

class EduThread1 extends Thread{
	PrintTable tob;
	public EduThread1(PrintTable t) {
		this.tob=t;
	}
	public void run() {
		tob.displayMultTable(2);
	}
}
class EduThread2 extends Thread{
	PrintTable tob1;
	public EduThread2(PrintTable t) {
		this.tob1=t;
	}
	public void run() {
		tob1.displayMultTable(6);
	}
}

public class MainAppThread {

	public static void main(String[] args) throws InterruptedException {
		PrintTable t=new PrintTable();
		EduThread1 t1=new EduThread1(t);
		EduThread2 t2=new EduThread2(t);
		
		t1.start();
		
		t2.start();
		
		

	}

}
