package com.web;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.*;

public class ObjectServer {
	public static void main(String [] args){
		ServerSocket serversocket = null;
		Socket socket = null;
		try {
			serversocket = new ServerSocket(1234);
			socket = serversocket.accept();
			ObjectInputStream objectinputstream = new ObjectInputStream(socket.getInputStream());
			Student s = (Student) objectinputstream.readObject();
			System.out.println("客户端发来对象"+s);
			ObjectOutputStream objectoutputstream = new ObjectOutputStream(socket.getOutputStream());
			objectoutputstream.writeObject(s);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
