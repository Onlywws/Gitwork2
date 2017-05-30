package com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class OutRunnable implements Runnable {
	Socket socket = null;
	public OutRunnable(Socket socket){
		this.socket= socket;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("请输入内容");
			String neirong = scanner.next();
			System.out.println("用户输入的是"+neirong);
			System.out.println("正在发送");
			
			PrintWriter printwriter = null;
			try {
				printwriter = new PrintWriter(socket.getOutputStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			printwriter.write(neirong+"\n");
			printwriter.flush();
		}
	}

}
