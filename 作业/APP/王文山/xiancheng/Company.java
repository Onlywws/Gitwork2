package com.xiancheng;

public class Company {
	private final static int MAX_SIZE =100;
	private int size=100; 
	
	public Company(int size){
		this.size = size;
	}
	//存货
	public void push(int number){
		if (getSize()+number <= MAX_SIZE ){
			System.out.println("生产了"+number+"当前库存为"+getSize());
			setSize(getSize()+number);
		}else{
			System.out.println("库存已满，暂停生产");
			try{
				this.wait();//让想获取该对向锁的线程处于等待状态
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		notifyAll();
	}
	
	//取货
	public synchronized void pop(int number){
		if(getSize()-number<0){
			try{
				this.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}else{
			//消费
			setSize (getSize()-number);
			System.out.println("消费"+number+"库存"+getSize());
		}
		notifyAll();
	}
	
	
	private int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	private void setSize(int size) {
		// TODO Auto-generated method stub
		this.size = size;
	}
}
