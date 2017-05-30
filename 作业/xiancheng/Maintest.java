package com.xiancheng;

public class Maintest {
	public static void main (String [] args){
		Company company = new Company(0);
		
		//消费者
		Coustom coustom1 = new Coustom(company,20);
		Coustom coustom2 = new Coustom(company,40);
		Coustom coustom3 = new Coustom(company,60);
		//生产者
		Product product1 =  new Product(company,40);
		Product product2 =  new Product(company,80);
		Product product3 =  new Product(company,50);
		
		new Thread(coustom1).start();
		new Thread(coustom2).start();
		new Thread(coustom3).start();
		
		new Thread(product1).start();
		new Thread(product2).start();
		new Thread(product3).start();
	}
}
