package ThreadDemo;
class Ab implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
}

public class RunnableDemo {
	public static void main(String[] args)
	{	
	Ab a=new Ab();
	Thread th = new Thread(a);
	th.start();
	Thread th1 = new Thread(a);
	th1.start();
	Thread th2 = new Thread(a);
	th2.start();
	th2.setPriority(10);
	Thread th3 = new Thread(a);
	th3.start();
	


	
	
}
}