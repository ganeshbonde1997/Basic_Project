package Interrupt;
class Test implements Runnable {
	public void run() {
		try {
			for (int i=0;i<=3;i++) {
				System.out.println(i);
				//Thread.sleep(1000);
			}
		}
		catch(Exception e){
			System.out.println("thread is interrupted" + e);
		}
	}
	
}
public class InterrputDemo {
	public static void main(String[] args) {
	Test t = new Test();
	Thread th= new Thread(t);
	th.start();
	th.interrupt();
	}
}
