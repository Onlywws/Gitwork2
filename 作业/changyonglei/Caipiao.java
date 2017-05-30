package com.changyonglei;

import java.util.Scanner;

public class Caipiao {
	public static void main(String[] args){
		int a[] = new int[5]; 
		int b[] = new int[5];
		System.out.println("请随机输入1-10内的5个不重复的数");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++){
			int c = sc.nextInt();
		}
		for(int j = 0;j<5;j++){
			b[j] = (int)(Math.random()*10+1);
			if(j>0){
				for(int n = 0;n<j;n++){
					if(b[j]==b[n]){
						b[j] = (int)(Math.random()*11+1);
						n=0;
					}
				}
			}
			System.out.println(b[j]+"\t");
		}
		int sum = 0;
		for(int k = 0;k<5;k++){
			for(int p = 0;p<5-k;k++){
				if(a[k]==b[p]){
					sum++;
					continue;
				}
			}
		}
		if(sum==5){
			System.out.println("恭喜获得一等奖");
		}else if(sum==4){
			System.out.println("恭喜获得二等奖");
		}else if(sum==3){
			System.out.println("恭喜获得三等奖");
		}else{
			System.out.println("未获奖");
		}
	}
}
