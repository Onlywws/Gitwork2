package com.xiancheng;

public class Product implements Runnable {
	private Company company;
	private int number;
	
	public Product(Company company, int number){
		this.company = company;
		this.number = number;
	}
	
	@Override
	public void run() {
		company.push(number);
	}

}
