package com.cdac.thread;


class Task implements Runnable {
	@Override
	public void run() {
		System.out.println("Inside Business Logic Method");
		}
}
public class ThreadProgram3 {

	public static void main(String[] args) {
		Runnable runnable = new Task();
		Thread th = new Thread(runnable);
		th.start();
	}

}
