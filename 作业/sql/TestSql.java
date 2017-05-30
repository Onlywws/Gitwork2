package com.sql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestSql {
	public static void main(String [] args) {
		TestSql main = new TestSql();
		main.select();
		//main.insert();
		//main.delete();
		//main.update();
	}
	Connection con;
	String driver = "com.mysql.jdbc.Driver";
	
	//查询
	public void select(){
		try {
			Class.forName(driver);
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/study1015", "root", "070206");
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
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//增加
	public void insert() {
		String name;
        String id1;
        PreparedStatement psql;
        ResultSet res;
          //预处理添加数据，其中有两个参数--“？”
          try {
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
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	}
	//删除
	public void delete(){
          PreparedStatement psql11;
	      //预处理删除数据
	      try {
	    	  psql11 = con.prepareStatement("delete from emp where sal > ?");
	    	  psql11.setFloat(1, 4500);
		      psql11.executeUpdate();
		      psql11.close();
	      } catch (SQLException e) {
			// TODO Auto-generated catch block
	    	  e.printStackTrace();
	      }
	}
	//更新
	public void update(){
		PreparedStatement psql1;
        //预处理更新（修改）数据，将王刚的sal改为5000.0
        try {
			psql1 = con.prepareStatement("update emp set sal = ? where ename = ?");
			psql1.setFloat(1,(float) 5000.0);      
	        psql1.setString(2,"王刚");             
	        psql1.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
}
