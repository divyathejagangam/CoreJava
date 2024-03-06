package divya.com;

class ThreadClass extends Thread{
	
	@Override
	
public	void run() {
		for(int i=1;i<40;i++)
		System.out.println(Thread.currentThread());
	}
	
	
}



public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread());
		ThreadClass ob1=new ThreadClass();
		ob1.start();
		ob1.setName("THREAD NUMBER 1");
		ThreadClass ob2=new ThreadClass();
		ob2.start();
		ob2.setName("THREAD NUMBER 2");
	}

}


