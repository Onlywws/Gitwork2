package com.changyonglei;
import java.util.*;
public class Caiquan {
	public static void main(String[]args){
		int a[]= new int[1];
	for(int i=1;i<100;i++){
		System.out.println("���ȭ");
		System.out.println("--1.ʯͷ--2.����--3.��--");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		a[0] = (int)(Math.random()*3+1);
		System.out.println("���Գ�"+a[0]);
		switch(b){
			case 1:
				if(a[0]==1){
					System.out.println("ƽ��");
				}else if(a[0]==2){
					System.out.println("niʤ");
				}else if(a[0]==3){
					System.out.println("����ʤ");
				}
				break;
			case 2:
				if(a[0]==1){
					System.out.println("����ʤ");
				}else if(a[0]==2){
					System.out.println("ƽ��");
				}else if(a[0]==3){
					System.out.println("niʤ");
				}
				break;
			case 3:
				if(a[0]==1){
					System.out.println("niʤ");
				}else if(a[0]==2){
					System.out.println("����ʤ");
				}else if(a[0]==3){
					System.out.println("ƽ��");
				}
				break;
			default:
				System.out.println("�������SB");
		}
	}
	}
}
