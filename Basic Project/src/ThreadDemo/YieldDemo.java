package ThreadDemo;
class Best extends Thread{
	public void run() {
		for (int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"   "+i);
		}
	}
}
public class YieldDemo {
public static void main(String[] args) {
	Best b= new Best();
	b.start();
	Thread.yield();
	for (int i=0; i<=5;i++) {
		System.out.println("Main Thread "+i);
	}
	
}
}
