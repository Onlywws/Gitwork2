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
		//����Connection����
		  Connection con;
		//����������
		  String driver = "com.mysql.jdbc.Driver";
		//URLָ��Ҫ���ʵ����ݿ���mydata
		  String url = "jdbc:mysql://localhost:3306/study1015";
		//MySQL����ʱ���û���
		  String user = "root";
		//MySQL����ʱ������
		  String password = "070206";
		//������ѯ�����
		  try {
		    //������������
		      Class.forName(driver);
		    //1.getConnection()����������MySQL���ݿ⣡��
		      con = DriverManager.getConnection(url,user,password);
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
		             
		             
		             
	    //����
		      		 String name;
		             String id1;
		             PreparedStatement psql;
			           ResultSet res;
			           //Ԥ����������ݣ���������������--������
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
			        
			           
			       //�޸ġ�
			           
			          PreparedStatement psql1;
			        //Ԥ������£��޸ģ����ݣ������յ�sal��Ϊ5000.0
			        psql1 = con.prepareStatement("update emp set sal = ? where ename = ?");
			        psql1.setFloat(1,(float) 5000.0);      
			        psql1.setString(2,"����");             
			        psql1.executeUpdate();
			      
			        
			        
			        //ɾ��
			        PreparedStatement psql11;
			      //Ԥ����ɾ������
			      psql11 = con.prepareStatement("delete from emp where sal > ?");
			      psql11.setFloat(1, 4500);
			      psql11.executeUpdate();
			      psql11.close();
			           
			           
		         } catch(ClassNotFoundException e) {   
		             //���ݿ��������쳣����
		             System.out.println("Sorry,can`t find the Driver!");   
		             e.printStackTrace();   
		             } catch(SQLException e) {
		             //���ݿ�����ʧ���쳣����
		             e.printStackTrace();  
		             }catch (Exception e) {
		             // TODO: handle exception
		             e.printStackTrace();
		         }finally{
		            System.out.println("���ݿ����ݳɹ���ȡ����");
		        }
		   
		   
		  
            
          
	}
}

