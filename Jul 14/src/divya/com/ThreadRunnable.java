package divya.com;

class FirstClass implements Runnable{ //one way of creating a thread by implementing a Runnable Interface
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println(Thread.currentThread());
		}
	}
}

public class ThreadRunnable {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		FirstClass ob=new FirstClass();
		FirstClass ob1=new FirstClass();
		Thread tob=new Thread(ob);
		Thread tob1=new Thread(ob1);
		tob.setName("firstthread");//change the name of the thread
		tob1.setName("secondthread");
		tob.start();
		tob1.start();
	}
}

