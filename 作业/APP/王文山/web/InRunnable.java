package com.web;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class InRunnable implements Runnable {
	Socket socket = null;
	public InRunnable (Socket socket){
		this.socket = socket;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try{
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String fanhui = bufferedReader.readLine();
				System.out.println("服务器返回消息为"+fanhui);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
	

