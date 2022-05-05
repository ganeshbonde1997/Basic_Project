class MT extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("Sitha Thread");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
}
public class JoinDemo {
	public static void main(String []args) throws InterruptedException
	{
		MT t1= new MT();
		t1.start();
		t1.join();
		for(int i=0; i<10; i++)
		{
			System.out.println("Rama Thread");
		}
	}
}
