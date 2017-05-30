package com.sql;

 import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 import java.sql.SQLException;
 import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class SqlDemo {
	public static void main(String [] args){
		//声明Connection对象
		  Connection con;
		//驱动程序名
		  String driver = "com.mysql.jdbc.Driver";
		//URL指向要访问的数据库名mydata
		  String url = "jdbc:mysql://localhost:3306/study1015";
		//MySQL配置时的用户名
		  String user = "root";
		//MySQL配置时的密码
		  String password = "070206";
		//遍历查询结果集
		  try {
		    //加载驱动程序
		      Class.forName(driver);
		    //1.getConnection()方法，连接MySQL数据库！！
		      con = DriverManager.getConnection(url,user,password);
		      if(!con.isClosed()){
		          System.out.println("Succeeded connecting to the Database!");
		      }
		    //2.创建statement类对象，用来执行SQL语句！！
		      Statement statement = con.createStatement();
		    //要执行的SQL语句
		      String sql = "select * from emp";
		    //3.ResultSet类，用来存放获取的结果集！！
		      ResultSet rs = statement.executeQuery(sql);
		      
		      System.out.println("-----------------");
		      System.out.println("执行结果如下所示:");  
		      System.out.println("-----------------");  
		      System.out.println("编号" + "\t" + "职位");  
		      System.out.println("-----------------");  
		              
		      String job = null;
		      String id = null;
		      while(rs.next()){
		        //获取stuname这列数据
		         id = rs.getString("empno");
		        //获取stuid这列数据
		         job = rs.getString("job");
		 
		        //输出结果
		          System.out.println(id + "\t" + job);
		      }
		         
		      rs.close();
		      con.close();
		             
		             
		             
	    //增加
		      		 String name;
		             String id1;
		             PreparedStatement psql;
			           ResultSet res;
			           //预处理添加数据，其中有两个参数--“？”
			           psql = con.prepareStatement("insert into emp (empno,ename,job,hiredate,sal,cpmm,deptno) "
			           		+ "values(?,?,?,?,?)");
			           psql.setInt(1, 3212);              //设置参数1，创建id为3212的数据
			           psql.setString(2, "王刚");      //设置参数2，name 为王刚
			           psql.setString(3, "总裁");
			           psql.setInt(4,5000);
			           DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
			           java.util.Date myDate2 = dateFormat2.parse("2010-09-13");
			           psql.setDate(5,new java.sql.Date(myDate2.getTime()));
			           psql.setDouble(6, 50.30);
			           psql.setDouble(7,(float)200.0);
			           psql.setInt(8,30);
			           psql.executeUpdate();           //执行更新
			        
			           
			       //修改、
			           
			          PreparedStatement psql1;
			        //预处理更新（修改）数据，将王刚的sal改为5000.0
			        psql1 = con.prepareStatement("update emp set sal = ? where ename = ?");
			        psql1.setFloat(1,(float) 5000.0);      
			        psql1.setString(2,"王刚");             
			        psql1.executeUpdate();
			      
			        
			        
			        //删除
			        PreparedStatement psql11;
			      //预处理删除数据
			      psql11 = con.prepareStatement("delete from emp where sal > ?");
			      psql11.setFloat(1, 4500);
			      psql11.executeUpdate();
			      psql11.close();
			           
			           
		         } catch(ClassNotFoundException e) {   
		             //数据库驱动类异常处理
		             System.out.println("Sorry,can`t find the Driver!");   
		             e.printStackTrace();   
		             } catch(SQLException e) {
		             //数据库连接失败异常处理
		             e.printStackTrace();  
		             }catch (Exception e) {
		             // TODO: handle exception
		             e.printStackTrace();
		         }finally{
		            System.out.println("数据库数据成功获取！！");
		        }
		   
		   
		  
            
          
	}
}

