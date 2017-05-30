package com.Duotai;

import java.util.*;
public class ZuCar {
	static Scanner sc = new Scanner(System.in);
	public static void main(String [] args){
		zu();
	}
	public static void zu(){
		
		System.out.println("*****欢迎来到租车系统*****");
		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println("*****确定租车？请选择*****");
		System.out.println("*****1.确定，2.退出*****");
		int a = sc.nextInt();
		if(a==1){
				System.out.println("****您可租车的类型及价目表****");
				out();
		}else if(a==2){
				exit();
		}else{
				System.out.println("输入有误,请退出");
				exit();
		}
	}
	
	public static void out(){
		Car [] car = new Car[5];
		car [0] = new Pickpeople(1,"奥迪",4,0,500);
		car [1] = new Pickpeople(2,"马自达",4,0,300);
		car [2] = new Goodandpeople(3,"皮卡",2,3,600);
		car [3] = new Pickgoods(4,"欧曼",3,30,800);
		System.out.println("序号****车名***载客数/人***载货量/吨***租价/日");
		System.out.println(car[0].id+"\t"+car[0].name+"\t"+car[0].number+"\t"+car[0].weight+"\t"+car[0].price);
		System.out.println(car[1].id+"\t"+car[1].name+"\t"+car[1].number+"\t"+car[1].weight+"\t"+car[1].price);
		System.out.println(car[2].id+"\t"+car[2].name+"\t"+car[2].number+"\t"+car[2].weight+"\t"+car[2].price);
		System.out.println(car[3].id+"\t"+car[3].name+"\t"+car[3].number+"\t"+car[3].weight+"\t"+car[3].price);

		System.out.println("------------------");
		System.out.println("------------------");
		System.out.println("输入你要租车的数量");
		int b = sc.nextInt();
		System.out.println("------------------");
		System.out.println("------------------");
		System.out.println("选择你要租的车辆的序号");
		int i=0;
		for(i=1;i<=b;i++){
			System.out.print("请输入第"+i+"辆车的序号");
			int c = sc.nextInt();
		}
		System.out.println("------------------");
		System.out.println("------------------");
		System.out.println("请输入你要租的天数");
		int d = sc.nextInt();
		System.out.println("------------------");
		System.out.println("------------------");
		System.out.println("------------------");
		System.out.println("------------------");
		System.out.println("------------------");
		System.out.println("------------------");
		System.out.println("再次确认这是你想要的信息？");
		for(i=0;i<b;i++){
			System.out.println("租的车是"+car[i].name);
		}
		System.out.println("租的天数是"+d);
		int sum=0;
		int person=0;
		int dun=0;
		for(i=0;i<b;i++){
			sum=car[i].price*d+sum;
			person=car[i].number*b+person;
			dun=car[i].weight*b+dun;
		}
		System.out.println("你的账单"+sum+"元"+person+"人"+dun+"吨");
	}
	
	public static void exit(){
		System.out.println("Bye Bye");
	}
}


