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
            //加载驱动类
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","070206");
            
            connection.setAutoCommit(false); //JDBC中默认是true，我们改成false，然后在后面手动提交
            
            ps1 = connection.prepareStatement("insert into lianjie values (?,?)");//?是占位符
            ps1.setObject(1, "你不好");
            ps1.setObject(2, "我好");
            ps1.execute();
            
            
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            ps2 = connection.prepareStatement("insert into lianjie values (?,?)");
            ps2.setObject(1, "你好");
            ps2.setObject(2, "我也好");
            ps2.execute();            
            
            connection.commit();//提交事务
         }catch (ClassNotFoundException e){
            e.printStackTrace();
            try {
            	connection.rollback();//某一条数据添加失败时，回滚
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


