package com.web;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class Server {

	public static void main(String []  args){
		ServerSocket serversocket = null;
		Socket socket = null;
		List<Socket> list = new ArrayList<Socket>();
		try{
			serversocket = new ServerSocket(6667);
			
			while(true){
				socket = serversocket.accept();
				list.add(socket);
				new Thread(new ClientRunnable(socket,list)).start();
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
