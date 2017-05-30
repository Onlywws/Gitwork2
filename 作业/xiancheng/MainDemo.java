package com.xiancheng;

public class MainDemo {
	public static void main(String [] args){
		Zhuanghu zhuanghu = new Zhuanghu("¿Ú¿Ú",4000);
		QuqianThread ka = new QuqianThread(zhuanghu,2000);
		QuqianThread zhe = new QuqianThread(zhuanghu,3000);
		new Thread(ka).start();
		new Thread(zhe).start();
	}
}
