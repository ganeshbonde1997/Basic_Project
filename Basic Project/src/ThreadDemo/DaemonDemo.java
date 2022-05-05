package ThreadDemo;
class Fest extends Thread{
	public void run() {
		System.out.println("child thread ");
		
	}
}

public class DaemonDemo {
	public static void main(String[] args) {
		Fest f =new Fest();
		//f.setDaemon(true);
		f.start();
		//System.out.println(f.isDaemon());
		//System.out.println(f.getName());
		System.out.println(f.isAlive());
		
		//System.out.println(f.isDaemon());
		
	//System.out.println(Thread.currentThread().getName());
	//Thread.currentThread().setName("Vaibhava");
	//System.out.println(Thread.currentThread().getName());
	}
}
