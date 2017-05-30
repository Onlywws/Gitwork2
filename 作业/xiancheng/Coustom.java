package com.xiancheng;

public class Coustom implements Runnable{
	private Company company;
	private int number;
	
	public Coustom(Company company,int number){
		this.company = company;
		this.number = number;
	}
	
	@Override
	public void run() {
		company.pop(number);
	}

}
