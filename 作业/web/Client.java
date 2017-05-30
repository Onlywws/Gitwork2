package com.web;

import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
	public static void main(String [] args){
		Socket socket = null;
		try{
			socket = new Socket("192.168.199.126",6667);
			Scanner scanner = new Scanner(System.in);
			
			while(true){
				//收发进行分离    线程
				
				//发
				new Thread(new OutRunnable(socket)).start();
				//收
				new Thread(new InRunnable(socket)).start();
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
