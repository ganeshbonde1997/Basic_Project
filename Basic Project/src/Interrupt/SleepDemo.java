package Interrupt;
class Test123 extends Thread{
	public void run()  {

			System.out.println("child Thread 1");
				}
	}
class Test12 extends Thread{
	public void run()  {

			System.out.println("child Thread2");
				}
	}
class Test124 extends Thread{
	public void run()  {

			System.out.println("child Thread3");
				}
	}
public class SleepDemo {
	public static void main(String[] args) {
		Test123 t= new Test123();
		t.start();	
		Test12 t1 = new Test12();
		t1.start();
		t1.yield();
		Test124 t2 = new Test124();
		t2.start();
		//t2.yield();
		Test123 t3 = new Test123();
		t3.start();
	}

}
