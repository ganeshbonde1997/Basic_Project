package Interrupt;
class Test1 implements Runnable{
	public void run() {
		try {
		//System.out.println(Thread.currentThread().interrupted());
			//System.out.println(Thread.currentThread().interrupted());
			System.out.println(Thread.currentThread().isInterrupted());
			System.out.println(Thread.currentThread().interrupted());
			for (int i=0;i<=5;i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
public class InterruptedDemo {
	public static void main(String args[]) {
	Test1 t= new Test1();
	Thread th=new Thread(t);
	th.setDaemon(true);
	System.out.println(th.isDaemon());
	th.start();
	th.interrupt();
	
	}
}
