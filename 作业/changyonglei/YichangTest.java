package com.changyonglei;
/*
public class YichangTest {
	public static void main(String[] args){
		try{
			add();
			return;
		}catch(MyException a){
			System.out.println("��ѧ�������");
			System.out.println(a.toString());     //��ȡ�쳣����
			System.out.println(a.getMessage());   //��ȡ�쳣��Ϣ
			a.printStackTrace();                  //��ӡ�쳣�ڶ�ջ�еĸ�����Ϣ
		}finally{
			System.out.println("���������ֵ");
		}
		
	}
	public static void add() throws MyException{
		int num1 = 0;
		int num2 = 33;
		int num3 = num2/num1;
	}
} 
class MyException extends Exception{
	 public MyException(){
		 super();
	 }    
	 public MyException(String message){
	     super(message);
	 }
} */

public class YichangTest{
	public static void main(String [] args){
		YichangTest ed = new YichangTest();
		ed.add();
	}

	public int add(){
		int num1 = 0;
		int num2 = 33;
		try{
			int num3 = num2/num1;
			return 0;
		}catch(ArithmeticException a){
			System.out.println("��ѧ�������");
			System.out.println(a.toString());     //��ȡ�쳣����
			System.out.println(a.getMessage());   //��ȡ�쳣��Ϣ
			a.printStackTrace();                  //��ӡ�쳣�ڶ�ջ�еĸ�����Ϣ
		}catch(Exception b){
			System.out.println("���쳣");
		}finally{
			System.out.println("���������ֵ");
		}return 0;
	}

}