package com.WUZIQI;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Main extends JFrame{
	public Main(){
		this.setLayout(null);
		
		Paint paint = new Paint();
		paint.setBounds(40,40,560,560);
		this.add(paint);
		
		JButton jbutton1 = new JButton();
		jbutton1.setText("开始游戏");
		jbutton1.setBounds(60, 590, 130 , 40 );
		jbutton1.setFont(new java.awt.Font("微软雅黑",0,18));
		this.add(jbutton1);
		
		JButton jbutton2 = new JButton();
		jbutton2.setText("悔棋");
		jbutton2.setBounds(245, 590, 130 , 40 );
		jbutton2.setFont(new java.awt.Font("微软雅黑",0,18));
		this.add(jbutton2);
		
		JButton jbutton3 = new JButton();
		jbutton3.setText("重新开始");
		jbutton3.setBounds(430, 590, 130 , 40 );
		jbutton3.setFont(new java.awt.Font("微软雅黑",0,18));
		this.add(jbutton3);
		
		this.setTitle("五子棋网络版");
		this.setBounds(200,200,650,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭程序
		this.setVisible(true);
	}
	
	public static void main (String [] args){
		new Main();
	}
}
