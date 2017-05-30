package com.WUZIQI;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;



public class Client {
	public static void main(String [] args){
		Socket socket = null;
		try {
			socket = new Socket("192.168.199.126",1234);
			OutputStream outputstream = socket.getOutputStream();
			ObjectOutputStream objectoutputstream = new ObjectOutputStream(outputstream);
			objectoutputstream .writeObject(outputstream);
			
			ObjectInputStream objectinputstream = new ObjectInputStream(socket.getInputStream());
			Qi student = (Qi) objectinputstream.readObject();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
