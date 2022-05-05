package com.java_programs;
class MyDemo extends Thread{
	public void run() {
		System.out.println("hii this is the first thread");
	}
}
class MyDemo1 extends Thread{
	public void run() {
		System.out.println("hii this is the second thread");
	}
}
class MyDemo2 extends Thread{
	public void run() {
		System.out.println("hii this is the third thread=="+Thread.currentThread().getName());
	}
}


public class FirstDemo {
public static void main(String[] args) {
	System.out.println("hii this is main method");
	MyDemo m = new MyDemo();
	m.start();
	MyDemo1 m1 = new MyDemo1();
	m1.yield();
	m1.start();
Thread.yield();
	MyDemo2 m2 = new MyDemo2();
	m2.start();
	//m2.yield();
	MyDemo2 m3 = new MyDemo2();
	m3.start();
}
}
