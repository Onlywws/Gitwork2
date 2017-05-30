package com.web;

public class MyRunnable implements Runnable {
	@Override
	public void run(){
		while (true){
			try{
				Thread.sleep(1000);
				System.out.println("我是子线程"+System.currentTimeMillis());
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
	}
}
