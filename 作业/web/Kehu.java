package com.web;

import java.io.*;
import java.net.Socket;

public class Kehu {
	public static void main(String [] args){
		try{
			//创建连接
			Socket socket = new Socket("192.168.199.126",2347);
			System.out.println("是否连接"+socket.isConnected());
			OutputStream o = socket.getOutputStream();
			o.write("我是王文山".getBytes());
			o.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
