class MT1 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0; i<100; i++)
			{
				System.out.println("Lazy Thread");
				Thread.sleep(5000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("I got Inerrupted");
		}
	}
}
public class InterruptDemo {
	public static void main(String []args)
	{
		MT1 t = new MT1();
		t.start();
		t.interrupt();
		System.out.println("End of main");
	}
}
