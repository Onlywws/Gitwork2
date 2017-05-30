package com.web;

import java.io.*;
import java.net.*;
import java.util.*;

public class Maintest {
	public static void main(String [] args){
		try{
			//创建服务器，并开通注册端口
			ServerSocket serversocket = new ServerSocket(2347);
			while(true){
				System.out.println("服务器端创建成功");    
				//监听对应端口    
				Socket socket = serversocket.accept();
				System.out.println("正在监听端口");
				//读出客户端的信息
				InputStream inputstream = socket.getInputStream();
				//缓冲区，放客户端的信息
				byte [] bytes = new byte[1024];
				int len = 0;
				
				StringBuffer stringbuffer = new StringBuffer();
				while ((len = inputstream.read(bytes))!=-1){
					stringbuffer.append(new String(bytes,0,len));
				}
				System.out.println("服务器端：你是干嘛的？");
				System.out.println("客户端："+stringbuffer);
				//输出IP地址
				String address = new String(socket.getInetAddress().getHostAddress());
				System.out.println("有人要来访问,地址是"+address);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
