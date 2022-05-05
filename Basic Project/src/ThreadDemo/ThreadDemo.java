package ThreadDemo;
class ThreadT extends Thread
{
	public ThreadT(String name)
	{
		super(name);
	}
	public void run()
	{
		int a=10;
		while(15>a)
		{
			System.out.println("this is Thread Example1");
			a++;
		}
	}
}
class ThreadT1 extends Thread
{
	public ThreadT1(String name) {
		super(name);
	}
	public void run() {
		//int a=10;
		//while (a<=10) {
			System.out.println("This is the second thread2");
		}
	//}
}

public class ThreadDemo {
	public static void main(String[] args) {
		ThreadT t1 = new ThreadT("ganesh");
		//t1.setPriority(Thread.MAX_PRIORITY);
		ThreadT1 t2 = new ThreadT1("vaibhav");
		t1.start();
		t2.start();
		t2.setPriority(10);
		System.out.println(t2.getPriority());
		System.out.println(t2.isAlive());
	System.out.println(Thread.currentThread().getName());	
	}

}
