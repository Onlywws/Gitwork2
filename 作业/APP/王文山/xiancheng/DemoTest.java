package com.xiancheng;

public class DemoTest {
	static int piao = 50;
	public static void main(String args []){
		
		/*
		//创建线程
		MyThread myThread = new MyThread();
		//启动线程
		myThread.start();
		try{
			Thread.sleep(1000);
			System.out.println(System.currentTimeMillis());
		}catch(Exception e){
			e.printStackTrace();
		}
		
		//创建线程
		MyRunnable myRunnable = new MyRunnable();
		//启动线程
		new Thread(myRunnable).start();
		
		for(int i = 0;i<10000;i++){
			System.out.println("我是主线程"+i);
		}
		
		*/
		
		
		Chuangkou chuangkou1 = new Chuangkou(piao,"窗口一");
		Chuangkou chuangkou2 = new Chuangkou(piao,"窗口二");
		Chuangkou chuangkou3 = new Chuangkou(piao,"窗口三");
		
		ChuangkouThread chuangkouThread1 = new ChuangkouThread(chuangkou1);
		ChuangkouThread chuangkouThread2 = new ChuangkouThread(chuangkou2);
		ChuangkouThread chuangkouThread3 = new ChuangkouThread(chuangkou3);
		
		chuangkouThread1.start();
		chuangkouThread2.start();
		chuangkouThread3.start();
		
	}
}
