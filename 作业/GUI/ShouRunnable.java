package com.GUI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JLabel;

public class ShouRunnable implements Runnable {
	Socket socket;
	JLabel jlabel;
	public ShouRunnable(Socket socket,JLabel jlabel){
		this.socket = socket;
		this.jlabel = jlabel;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String neirong = bufferedreader.readLine();
				//œ‘ æµΩLABLE÷–
				jlabel.setText(jlabel.getText()+neirong);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
