
public class Multithreading1 extends Thread 
{
	public void run()
	{
		for(int i=0; i<10;i++)
		{
			System.out.println("Child Thread");
		}
	}
}
class ThreadPriorityDemo
{
	public static void main(String []args)
	{
		Thread t = new Thread();
		t.setPriority(10);
		t.start();
		for(int i=0; i<=10;i++)
		{
			System.out.println("Main Method");
		}
	}
}
