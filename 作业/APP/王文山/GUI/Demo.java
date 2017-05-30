package com.GUI;

import javax.swing.*;

public class Demo extends JFrame {
	
	public  Demo(){
		this.setLayout(null);
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
		
		this.setBounds(400,400,400,400);
		this.setVisible(true);
	}
	public static void main(String [] args){
		new Demo();
	}
}
