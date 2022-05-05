
package ThreadDemo;
class Rest extends Thread{
	//static Thread mainthread;
	public void run() {
		try {
	//mainthread.join();	
		for (int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"   "+i);
			Thread.sleep(1000);
		}
	}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
public class JoinDemo {
public static void main(String[] args) throws Exception{
	Rest b= new Rest();
	b.setName("Child thread");
	
	//b.interrupt();
	b.start();
	
	b.join();
	//Thread.currentThread().interrupt();
	Thread mainthread = Thread.currentThread();
	//Thread.yield();
	try {
	for (int i=0; i<=5;i++) {
		System.out.println("vaibhav"+i);
		Thread.sleep(1000);
	}}
	catch(Exception e) {
		System.out.println(e);
	}
	}
	
}


