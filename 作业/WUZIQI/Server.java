package com.WUZIQI;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;



public class Server {
	public static void main(String [] args){
		ServerSocket serversocket = null;
		Socket socket = null;
		try {
			serversocket = new ServerSocket(1234);
			System.out.println("等待客户端连接");
			socket = serversocket.accept();
			ObjectInputStream objectinputstream = new ObjectInputStream(socket.getInputStream());
			Qi q = (Qi) objectinputstream.readObject();
			System.out.println("客户端发来对象"+q);
			ObjectOutputStream objectoutputstream = new ObjectOutputStream(socket.getOutputStream());
			objectoutputstream.writeObject(q);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
