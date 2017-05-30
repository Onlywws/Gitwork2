package com.web;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.util.*;
//服务器
public class Main2 {
	public static void main (String [] args){
		ServerSocket serversocket = null;//服务器端
		Socket socket =null;//表示客户端
		try{
			serversocket = new ServerSocket(4390);
			System.out.println("服务器创建成功，等待客户连接");
			socket = serversocket.accept();//等待客户端
			System.out.println("连接成功正在读取数据");
			//接受客户端发来的数据
			InputStream inputstream = socket.getInputStream();
			int len = 0;
			byte [] bytes = new byte[1024];
			StringBuffer stringbuffer = new StringBuffer();
			while((len=inputstream.read(bytes))!=-1){
				stringbuffer.append(new String(bytes,0,len));
			}
			System.out.println("客户端发来消息："+stringbuffer);
			String s = "我已经收到消息："+stringbuffer.toString();
			
			//将数据发送到客户端
			System.out.println("正在向客户端返回消息");
			OutputStream outputstream = socket.getOutputStream();
			outputstream.write(s.getBytes());
			
			outputstream.close();
			inputstream.close();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("关闭连接");
			if(socket!=null){
				if(socket.isConnected()){
					try {
						//socket.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			//关闭连接
			if(serversocket != null){
				if(serversocket.isClosed()){
					try {
						serversocket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}

	
