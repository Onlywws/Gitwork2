package com.Duotai;

import java.util.*;
public class ZuCar {
	static Scanner sc = new Scanner(System.in);
	public static void main(String [] args){
		zu();
	}
	public static void zu(){
		
		System.out.println("*****��ӭ�����⳵ϵͳ*****");
		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println("*****ȷ���⳵����ѡ��*****");
		System.out.println("*****1.ȷ����2.�˳�*****");
		int a = sc.nextInt();
		if(a==1){
				System.out.println("****�����⳵�����ͼ���Ŀ��****");
				out();
		}else if(a==2){
				exit();
		}else{
				System.out.println("��������,���˳�");
				exit();
		}
	}
	
	public static void out(){
		Car [] car = new Car[5];
		car [0] = new Pickpeople(1,"�µ�",4,0,500);
		car [1] = new Pickpeople(2,"���Դ�",4,0,300);
		car [2] = new Goodandpeople(3,"Ƥ��",2,3,600);
		car [3] = new Pickgoods(4,"ŷ��",3,30,800);
		System.out.println("���****����***�ؿ���/��***�ػ���/��***���/��");
		System.out.println(car[0].id+"\t"+car[0].name+"\t"+car[0].number+"\t"+car[0].weight+"\t"+car[0].price);
		System.out.println(car[1].id+"\t"+car[1].name+"\t"+car[1].number+"\t"+car[1].weight+"\t"+car[1].price);
		System.out.println(car[2].id+"\t"+car[2].name+"\t"+car[2].number+"\t"+car[2].weight+"\t"+car[2].price);
		System.out.println(car[3].id+"\t"+car[3].name+"\t"+car[3].number+"\t"+car[3].weight+"\t"+car[3].price);

		System.out.println("------------------");
		System.out.println("------------------");
		System.out.println("������Ҫ�⳵������");
		int b = sc.nextInt();
		System.out.println("------------------");
		System.out.println("------------------");
		System.out.println("ѡ����Ҫ��ĳ��������");
		int i=0;
		for(i=1;i<=b;i++){
			System.out.print("�������"+i+"���������");
			int c = sc.nextInt();
		}
		System.out.println("------------------");
		System.out.println("------------------");
		System.out.println("��������Ҫ�������");
		int d = sc.nextInt();
		System.out.println("------------------");
		System.out.println("------------------");
		System.out.println("------------------");
		System.out.println("------------------");
		System.out.println("------------------");
		System.out.println("------------------");
		System.out.println("�ٴ�ȷ����������Ҫ����Ϣ��");
		for(i=0;i<b;i++){
			System.out.println("��ĳ���"+car[i].name);
		}
		System.out.println("���������"+d);
		int sum=0;
		int person=0;
		int dun=0;
		for(i=0;i<b;i++){
			sum=car[i].price*d+sum;
			person=car[i].number*b+person;
			dun=car[i].weight*b+dun;
		}
		System.out.println("����˵�"+sum+"Ԫ"+person+"��"+dun+"��");
	}
	
	public static void exit(){
		System.out.println("Bye Bye");
	}
}


