package com.WUZIQI;

import java.awt.Color;

public class Qi {
	private int x;//x������
	private int y;//Y������
	private Color color;//��ɫ
	public static final int POINT_size = 40;//���Ӵ�С
	//������
	public Qi(int x,int y ){
		this.x = x;
		this.y = y;
	}
	//������
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
