package com.web;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class UrlTest {
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		while(true){
			String useTalk = scanner.next();
			//url
			String url = "http://www.tuling123.com/openapi/api?key=a1fc2143eb9846fa85fae48e5e2c3744&info="+useTalk;
			try {
				//����URL����
				URL url1 = new URL(url);
				//��URL
				URLConnection urlconnection = url1.openConnection();
				//������������
				urlconnection.connect();
				//��ȡ��������
				/*InputStream inputstream  = urlconnection.getInputStream();
				byte[] bytes = new byte[1024];
				int len = 0;
				File file = new File("1.jpg");
				FileOutputStream fileoutputstream = new FileOutputStream(file);
				while((len=inputstream.read(bytes))!=-1){
					fileoutputstream.write(bytes, 0, len);
				}*/
				
				
				//��ȡԴ�ļ�
				BufferedReader bufferreader = new BufferedReader(new InputStreamReader (urlconnection.getInputStream())) ;
				StringBuffer stringbuffer = new StringBuffer();
				String s = " ";
				
				System.out.println(bufferreader.readLine());
				bufferreader.readLine();
			
				
			}  catch (Exception e) {
				// TODO Auto-generated catch block	
				e.printStackTrace();
			}
		}
		
	}
}
