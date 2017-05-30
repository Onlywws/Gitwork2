package com.GUI;

import java.awt.Color;

public class Wuziqi {
	private int x;//x点坐标
	private int y;//y点坐标
	private Color color;
	public static final int POINT_size = 40;//棋子的大小
	
	public Wuziqi(int x,int y ){
		this.x = x;
		this.y = y;
	}
	
	public Wuziqi(int x,int y ,Color color){
		this.x = x;
		this.y = y;
		this.color = color;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void setX(int x){
		this.x = x;
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
