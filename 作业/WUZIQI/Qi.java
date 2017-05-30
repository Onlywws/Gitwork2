package com.WUZIQI;

import java.awt.Color;

public class Qi {
	private int x;//x轴坐标
	private int y;//Y轴坐标
	private Color color;//颜色
	public static final int POINT_size = 40;//棋子大小
	//构造器
	public Qi(int x,int y ){
		this.x = x;
		this.y = y;
	}
	//构造器
	public Qi(int x,int y ,Color color){
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public int getX(){
		return x;
	}
	public void setX(int x){
		this.x = x;
	}
	public int getY(){
		return y;
	}
	public void setY(int y){
		this.y = y;
	}
	public Color getColor(){
		return color;
	}
	public void setColor(Color color){
		this.color = color;
	}
	@Override
	public String toString() {
		return "Wuziqi [x=" + x + ", y=" + y + ", color=" + color + "]";
	}
}
