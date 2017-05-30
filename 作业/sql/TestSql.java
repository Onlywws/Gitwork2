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
	
	//��ѯ
	public void select(){
		try {
			Class.forName(driver);
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/study1015", "root", "070206");
			if(!con.isClosed()){
		          System.out.println("Succeeded connecting to the Database!");
		    }
		    //2.����statement���������ִ��SQL��䣡��
		      Statement statement = con.createStatement();
		    //Ҫִ�е�SQL���
		      String sql = "select * from emp";
		    //3.ResultSet�࣬������Ż�ȡ�Ľ��������
		      ResultSet rs = statement.executeQuery(sql);
		      
		      System.out.println("-----------------");
		      System.out.println("ִ�н��������ʾ:");  
		      System.out.println("-----------------");  
		      System.out.println("���" + "\t" + "ְλ");  
		      System.out.println("-----------------");  
		              
		      String job = null;
		      String id = null;
		      while(rs.next()){
		        //��ȡstuname��������
		         id = rs.getString("empno");
		        //��ȡstuid��������
		         job = rs.getString("job");
		 
		        //������
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
	//����
	public void insert() {
		String name;
        String id1;
        PreparedStatement psql;
        ResultSet res;
          //Ԥ����������ݣ���������������--������
          try {
        	  psql = con.prepareStatement("insert into emp (empno,ename,job,hiredate,sal,cpmm,deptno) "
				  		+ "values(?,?,?,?,?)");
        	  psql.setInt(1, 3212);              //���ò���1������idΪ3212������
	          psql.setString(2, "����");      //���ò���2��name Ϊ����
	          psql.setString(3, "�ܲ�");
	          psql.setInt(4,5000);
	          DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
	          java.util.Date myDate2 = dateFormat2.parse("2010-09-13");
	          psql.setDate(5,new java.sql.Date(myDate2.getTime()));
	          psql.setDouble(6, 50.30);
	          psql.setDouble(7,(float)200.0);
	          psql.setInt(8,30);
	          psql.executeUpdate();           //ִ�и���
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	}
	//ɾ��
	public void delete(){
          PreparedStatement psql11;
	      //Ԥ����ɾ������
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
	//����
	public void update(){
		PreparedStatement psql1;
        //Ԥ������£��޸ģ����ݣ������յ�sal��Ϊ5000.0
        try {
			psql1 = con.prepareStatement("update emp set sal = ? where ename = ?");
			psql1.setFloat(1,(float) 5000.0);      
	        psql1.setString(2,"����");             
	        psql1.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
}
