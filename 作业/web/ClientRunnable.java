package com.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class ClientRunnable implements  Runnable{
	
	Socket socket = null;
	List<Socket> sockets =null;
	public ClientRunnable(Socket socket,List<Socket> sockets){
			this.socket = socket;
			this.sockets = sockets;
	}
	@Override
	public void run() {
		while(true){
			try {
				BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String xiaoxi = bufferedreader.readLine();
				System.out.println("客户端返回内容为："+xiaoxi);
				String s = "服务器返回"+xiaoxi;
				for(Socket socket1:sockets){
					PrintWriter printwriter = new PrintWriter(socket1.getOutputStream());
					printwriter.write(s+"\n");
					printwriter.flush();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
