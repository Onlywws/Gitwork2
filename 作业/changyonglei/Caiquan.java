package com.changyonglei;
import java.util.*;
public class Caiquan {
	public static void main(String[]args){
		int a[]= new int[1];
	for(int i=1;i<100;i++){
		System.out.println("请出拳");
		System.out.println("--1.石头--2.剪刀--3.布--");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		a[0] = (int)(Math.random()*3+1);
		System.out.println("电脑出"+a[0]);
		switch(b){
			case 1:
				if(a[0]==1){
					System.out.println("平局");
				}else if(a[0]==2){
					System.out.println("ni胜");
				}else if(a[0]==3){
					System.out.println("电脑胜");
				}
				break;
			case 2:
				if(a[0]==1){
					System.out.println("电脑胜");
				}else if(a[0]==2){
					System.out.println("平局");
				}else if(a[0]==3){
					System.out.println("ni胜");
				}
				break;
			case 3:
				if(a[0]==1){
					System.out.println("ni胜");
				}else if(a[0]==2){
					System.out.println("电脑胜");
				}else if(a[0]==3){
					System.out.println("平局");
				}
				break;
			default:
				System.out.println("你出错了SB");
		}
	}
	}
}
