package com.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Enter2 extends JFrame {
	
	public  Enter2(){
		this.setLayout(null);
		this.setSize(400,400);
		this.setTitle("QQ");
		this.setVisible(true);
		Icon icon = new ImageIcon("");
		
		JLabel jlabel = new JLabel();
		jlabel.setText("QQ");
		jlabel.setBounds(10, 10, 20, 20);
		this.add(jlabel);
		
		JLabel jlabel1 = new JLabel();
		jlabel1.setText("’À∫≈£∫");
		jlabel1.setBounds(70,60,260,30);
		this.add(jlabel1);
		
		JTextArea jtextarea1 = new JTextArea();
		jtextarea1.setText("«Î ‰»Î£∫");
		jtextarea1.setBounds(70,90,260,40);
		this.add(jtextarea1);
		
		JLabel jlabel2 = new JLabel();
		jlabel2.setText("√‹¬Î£∫");
		jlabel2.setBounds(70,130,260,30);
		this.add(jlabel2);
		
		JTextArea jtextarea2 = new JTextArea();
		jtextarea2.setText("«Î ‰»Î");
		jtextarea2.setBounds(70,160,260,40);
		this.add(jtextarea2);
		
		JButton jbutton = new JButton();
		jbutton.setText("µ«¬Ω");
		jbutton.setBounds(70, 210, 260, 40);
		this.add(jbutton);
		
		jbutton.addActionListener(
				new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						String i = jtextarea1.getText();
						String j = jtextarea2.getText();
						if(i.equals("2802349400")&&j.equals("2802349400")){
							System.out.println("µ«¬Ω≥…π¶");
							new Test2();
						}else{
							System.out.println("’À∫≈ªÚ√‹¬Î¥ÌŒÛ");
						}
					}
					
				}
				);
		
	}
	public static void main(String [] args){
		new Enter2();
		
	}
}
