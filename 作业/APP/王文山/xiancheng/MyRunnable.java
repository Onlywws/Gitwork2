package com.xiancheng;

public class MyRunnable implements Runnable{
	@Override
	public void run(){
		while (true){
			try{
				Thread.sleep(1000);
				System.out.println("我是子线程二"+System.currentTimeMillis());
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
	}
}
