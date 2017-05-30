package com.xiancheng;

public class MyThread extends Thread{
	public void run(){
		while (true){
			try{
				Thread.sleep(1000);
				System.out.println("我是子线程一"+System.currentTimeMillis());
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
	}
}
