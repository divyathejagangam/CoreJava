package div.com;

class IterationClass implements Runnable
{
	@Override
	
	public void run()	{
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread()+ " "+i);
			
			try {
				
				Thread.sleep(5000);
			}
			
			catch(InterruptedException e){
				e.printStackTrace();
			}
			
	}
		
	}
	
}
	
	
	

public class ThreadClassMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		IterationClass ob=new IterationClass();
		IterationClass ob1=new IterationClass();
		Thread tob=new Thread(ob);
		Thread tob1=new Thread(ob1);
		
 
		tob.setName("first");
		System.out.println("tob is Alive "+tob.isAlive());
		tob.start();//runnable state
		              //whenever JVM starts execution of the object
		              //from runnable state it goes to run state
		System.out.println("tob is Alive "+tob.isAlive());
		System.out.println("tob is Alive "+tob1.isAlive());
		try {
		tob.join();
		}
		catch(InterruptedException e){
		e.printStackTrace();	
		}
		
		System.out.println("tob is Alive "+tob.isAlive());

		tob1.setName("second");
		tob1.start();
		System.out.println("tob1 is Alive "+tob1.isAlive());

		

	}

}
