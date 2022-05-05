package ThreadDemo;

class Thread1 extends Thread{
	public void run() 
	{
		try
		{
		for (int i=1; i<=5;i++) {
	System.out.println("This is the child thread"+i);
	Thread.sleep(1000);
		}
}
		catch(Exception e) {
			System.out.println(e);
		}
		}
	}

public class SleepDemo {
public static void main(String[] args) {
	Thread1 t = new Thread1();
	t.start();
	t.interrupt();
}
}
