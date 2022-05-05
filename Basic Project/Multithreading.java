
//Write a program to extending the thread class
class Multithreading extends Thread{
	
public void run()
{
	for(int i=0;i<5;i++)
	{
		System.out.println("this is thread class");
	}
}
	
	class ThreadDemo
	{
		public static void main(String[] args)
		{
			Multithreading t = new Multithreading();
			t.run();
			t.start();
			for(int i=0; i<=10; i++)
			{
				System.out.println("MainThread");
			}
		}
	}
	
}
