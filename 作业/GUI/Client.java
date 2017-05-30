package com.GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;


import javax.swing.*;

public class Client extends  JFrame{
	public Client(Socket socket){
		this.setLayout(null);
		//ÔªËØ
		JLabel label = new JLabel();
		label.setOpaque(true);
		label.setBackground(Color.white);
		label.setBounds(0, 0, 500, 300);
		this.add(label);
		JTextField field = new JTextField();
		field.setBounds(0, 300, 500, 20);
		this.add(field);
		JButton button = new JButton("·¢ËÍ");
		button.setBounds(0,320, 100, 30);
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				field.getText();
				String neirong = field.getText();
				if("".equals(neirong)){
					try {
						PrintWriter printwriter = new PrintWriter(socket.getOutputStream());
						printwriter.write(neirong+"\n");
						printwriter.flush();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				field.setText("");
				
			}
			
		}
				);
		this.add(button);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300,300,500,500);
		this.setVisible(true);
	}
	
	public static void main(String [] args){
		Socket socket = null;
		try {
			socket = new Socket("192.168.199.126",1234);
			
			PrintWriter printwriter = new PrintWriter(socket.getOutputStream());
			printwriter.write("gaoji\n");
			printwriter.flush();
			
			new Client(socket);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
