package com.web;

import java.io.*;
import java.net.*;

public class ObjectClient {
	public static void main(String [] args){
		Socket socket = null;
		try {
			socket = new Socket("192.168.199.126",1234);
			OutputStream outputstream = socket.getOutputStream();
			ObjectOutputStream objectoutputstream = new ObjectOutputStream(outputstream);
			objectoutputstream .writeObject(new Student("wws",18));
			
			ObjectInputStream objectinputstream = new ObjectInputStream(socket.getInputStream());
			Student student = (Student) objectinputstream.readObject();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
