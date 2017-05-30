package com.web;


public class XianchengDemo {
	public static void main (String [] args){	
		//创建线程
		MyRunnable myRunnable1 = new MyRunnable();
		MyRunnable myRunnable2 = new MyRunnable();
		MyRunnable myRunnable3 = new MyRunnable();
		//启动线程
		new Thread(myRunnable1).start();
		new Thread(myRunnable2).start();
		new Thread(myRunnable3).start();
	}
}
