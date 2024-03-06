package com.div;

public class ObjectSynchronization  implements Runnable
{
	int tickets = 3;
    static int i = 1, j = 2, k = 3;
 void bookticket (String name, int wantedtickets) //t1, t2
{
  synchronized (this) { //blocking object or lock a part of function
	

    if (wantedtickets <= tickets)
    {
        System.out.println (wantedtickets + " booked to " + name);
        tickets = tickets - wantedtickets;
    }
    else
    {
        System.out.println ("No tickets to book");
    }
  }
  
  for(int i=1;i<=3;i++) {
	  System.out.println(Thread.currentThread());
  }
  
	 
  
  
}
public void run ()
{
    String name = Thread.currentThread ().getName ();
    if (name.equals ("t1"))
    {
        bookticket (name, i);
    }
    else if (name.equals ("t2"))
    {
        bookticket (name, j);
    }
    else
    {
        bookticket (name, k);
    }
}
public static void main (String[]args) throws InterruptedException
{
	ObjectSynchronization s = new ObjectSynchronization ();
    Thread t1 = new Thread (s);
    Thread t2 = new Thread (s);
    Thread t3 = new Thread (s);
    t1.setName ("t1");
    t2.setName ("t2");
    t3.setName ("t3");
   
    t1.start ();
   
    t2.start ();
    t3.start();
    
}
}

