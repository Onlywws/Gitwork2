package com.GUI;

import javax.swing.JFrame;

public class TestMain extends JFrame {
	public TestMain(){
		this.setLayout(null);//设置用户界面上的屏幕组件
		
		TestPaint testpaint = new TestPaint();
		testpaint.setBounds(40,40,600,600);
		this.add(testpaint);
		
		this.setTitle("五子棋");
		this.setBounds(200,200,650,650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭程序
		this.setVisible(true);
	}
	public static void main(String [] args){
		new TestMain();
	}
}
