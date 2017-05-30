package com.qq2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.QQ.ServerRunnable;

public class Server {
	public static void main(String args[]) {
		   ServerSocket s = null;
		   Socket t = null;
		   List<Socket> list = new ArrayList<Socket>();
		   Map<String,Socket> map = new HashMap<String,Socket>();
		   try{
			   //��������ˣ�����ͨע��˿�
				System.out.println("�����ɹ������ڵȴ��ͻ�������");
				s = new ServerSocket(9998);  
				//������Ӧ�˿� ����
				while(true){
					System.out.println("�ȴ��ͻ��˷�������");
					t = s.accept();
					BufferedReader bf = new BufferedReader(new InputStreamReader(t.getInputStream()));
					String name = bf.readLine();
					map.put(name,t);
					list.add(t);
					new Thread(new ServerRunnable(t,list,map)).start();	
				}       
			} catch (Exception e) {
				e.printStackTrace(); 
			}
		}    
}
