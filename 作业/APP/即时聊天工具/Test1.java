import java.net.*;
import java.io.*;
 
import javax.swing.*;
 
import java.awt.*;
import java.awt.event.*;

public class Test1 extends JFrame implements ActionListener , KeyListener {
	    JTextArea jta=null;
	    JScrollPane jsp=null;
	    JTextField jtf=null;
	    JButton jb=null;
	    JPanel jp=null;
	     
	    InputStreamReader isr=null;
	    BufferedReader br=null;
	    PrintWriter pw=null;
	    Socket s;
	    String jtatext="";
	 
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Test1 sv2=new Test1();
	    }
	    public Test1(){
	        jta=new JTextArea();
	        jta.setEditable(false);
	        jsp=new JScrollPane(jta);
	        jtf=new JTextField(10);
	        jtf.addKeyListener(this);
	        jb=new JButton("发送");
	        jb.addActionListener(this);
	        jp=new JPanel();
	        jp.add(jtf);
	        jp.add(jb);
	         
	        this.add(jsp,"Center");
	        this.add(jp,"South");
	         
	        this.setSize(300,300);
	        this.setLocationRelativeTo(this);
	        this.setTitle("服务器端");
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setVisible(true);
	         
	        try{
	         
	        ServerSocket ss=new ServerSocket(6789);
	        s=ss.accept();
	        isr=new InputStreamReader(s.getInputStream());
	        br=new BufferedReader(isr);
	        pw=new PrintWriter(s.getOutputStream(),true);
	        while(true){
	        String info=br.readLine();
	        jta.append("客户端对服务器说：   "+info+"\r\n");
	    // 
	 
	        }  
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	         
	         
	    }
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if(e.getSource()==jb){
	            try {
	             
	                pw.println(jtf.getText());
	                jta.append("服务器对客户端说：   "+jtf.getText()+"\r\n");
	            //  jta.setText(jtatext);
	                jtf.setText("");
	            } catch (Exception e1) {
	                // TODO Auto-generated catch block
	                e1.printStackTrace();
	            }
	             
	        }
	         
	    }
	    @Override
	    public void keyTyped(KeyEvent e) {}
	    @Override
	    public void keyPressed(KeyEvent e) {
	        if(e.getKeyCode()==KeyEvent.VK_ENTER){
	            try {
	                pw.println(jtf.getText());
	                jta.append("服务器对客户端说：   "+jtf.getText()+"\r\n");
	                jtf.setText("");
	            } catch (Exception e1) {
	                e1.printStackTrace();
	            }
	        }
	         
	    }
	    @Override
	    public void keyReleased(KeyEvent e) {}
	 
}
