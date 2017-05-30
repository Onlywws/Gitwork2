package com.QQ;

import java.awt.event.*;

import java.io.*;
import java.net.Socket;
import java.sql.*;
import javax.swing.*;

public class Client2 extends JFrame{
	public Client2(Socket t){
		this.setLayout(null);
		this.setTitle("客户端");
		//消息显示框
		JTextArea jTextArea = new JTextArea();
		jTextArea.setBounds(30,20,420,300);
		jTextArea.setEditable(false);
		this.add(jTextArea);
		//显示历史消息
		try {
			Connection con = Demo.getInstace();
	     	Statement statement = con.createStatement();
	     	String sql = "select * from qq";
	        ResultSet rs = statement.executeQuery(sql);
 	        while(rs.next()){
 	        	jTextArea.setText(jTextArea.getText()+"\n"+rs.getString("xiaoxi"));
 	        }
		} catch(Exception e1) {   
	         	e1.printStackTrace();
	    }
		
		JTextField jTextField = new JTextField();
		jTextField.setBounds(30,340,330,30);
		this.add(jTextField);
		
		JButton jButton = new JButton();
		jButton.setText("发送");
		jButton.setBounds(380,340,70,30);
		jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = jTextField.getText();
				if(!"".equals(s)){
					try {
						PrintWriter printWriter = new PrintWriter(t.getOutputStream());
						printWriter.write(s+"\n");
						printWriter.flush();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				jTextField.setText("");
			}
		});
		this.add(jButton);	
		
		JButton jButton2 = new JButton();
		jButton2.setText("历史消息");
		jButton2.setBounds(30,380,90,30);
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con = Demo.getInstace();
			     	Statement statement = con.createStatement();
			     	String sql = "select * from qq";
			        ResultSet rs = statement.executeQuery(sql);
	 	        	while(rs.next()){
		 	        
		 	        	jTextArea.setText(jTextArea.getText()+"\n"+rs.getString("xiaoxi"));
		 	        }
				} catch(Exception e1) {   
			         	e1.printStackTrace();
			    }
			}
		});
		this.add(jButton2);	
		
		JButton jButton3 = new JButton();
		jButton3.setText("清除历史消息");
		jButton3.setBounds(150,380,120,30);
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					PreparedStatement psql = (PreparedStatement) Demo.getInstace().prepareStatement("truncate table qq");
					psql.executeUpdate();
			    	
				} catch(Exception e1) {   
		         	e1.printStackTrace();
		        } 	  
			}
		});
		this.add(jButton3);	
		
		JButton jButton4 = new JButton();
		jButton4.setText("清除聊天消息");
		jButton4.setBounds(300,380,120,30);
		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTextArea.setText("");
			}
		});
		this.add(jButton4);	
		
		
		new Thread(new ClientRunnable(t, jTextArea)).start();
		
		this.setBounds(200,200,500,460);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setVisible(true);
	}
	public static void main(String[] args){
		Socket t = null;
		try {
			System.out.println("正在连接服务器");
			t = new Socket("192.168.199.142",1357); 
			PrintWriter printWriter = new PrintWriter(t.getOutputStream());
			printWriter.write("王文山\n");
			printWriter.flush();
			new Client2(t);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
