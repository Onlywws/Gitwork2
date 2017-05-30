package com.lianjie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo {
	public static void main(String[] args) 
    {
        Connection connection = null;
        PreparedStatement ps1 = null;
        PreparedStatement ps2 = null;

        try
        {
            //����������
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","070206");
            
            connection.setAutoCommit(false); //JDBC��Ĭ����true�����Ǹĳ�false��Ȼ���ں����ֶ��ύ
            
            ps1 = connection.prepareStatement("insert into lianjie values (?,?)");//?��ռλ��
            ps1.setObject(1, "�㲻��");
            ps1.setObject(2, "�Һ�");
            ps1.execute();
            
            
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            ps2 = connection.prepareStatement("insert into lianjie values (?,?)");
            ps2.setObject(1, "���");
            ps2.setObject(2, "��Ҳ��");
            ps2.execute();            
            
            connection.commit();//�ύ����
         }catch (ClassNotFoundException e){
            e.printStackTrace();
            try {
            	connection.rollback();//ĳһ���������ʧ��ʱ���ع�
            } catch (SQLException e1){
                e1.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                if(ps1!=null){
                    ps1.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if(connection!=null) {
                	connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}


