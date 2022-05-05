package ThreadDemo;
class Test extends Thread{

	public void run() {
		System.out.println("Thread task");
		System.out.println(Thread.currentThread().getName());
	}
}
public class Methods {
	public static void main(String[] args) {
		System.out.println("hello");
 		//System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Ganesh");
		System.out.println(Thread.currentThread().getName());
	//	System.out.println(10/0);
		Test t = new Test();
		t.start();
		//System.out.println(t.isAlive());
	}

}
