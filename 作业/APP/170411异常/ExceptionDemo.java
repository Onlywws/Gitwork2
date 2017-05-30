/*
public class ExceptionDemo{
	public static void main(String [] args){
		ExceptionDemo ed = new ExceptionDemo();
		ed.add();
	}

	public void add(){
		int num1 = 0;
		int num2 = 33;
		try{
			int num3 = num2/num1;
		}catch(ArithmeticException a){
			System.out.println("数学运算错误");
			System.out.println(a.toString());     //获取异常名称
			System.out.println(a.getMessage());   //获取异常信息
			a.printStackTrace();                  //打印异常在堆栈中的跟踪信息
		}catch(Exception b){
			System.out.println("大异常");
		}finally{
			System.out.println("最终输出的值");
		}
	}

}
*/

public class ExceptionDemo{
	public static void main(String [] args){
		try{
			add();
		}catch(ArithmeticException a){
			System.out.println("数学运算错误");
			System.out.println(a.toString());     //获取异常名称
			System.out.println(a.getMessage());   //获取异常信息
			a.printStackTrace();                  //打印异常在堆栈中的跟踪信息
		}catch(Exception b){
			System.out.println("大异常");
		}finally{
			System.out.println("最终输出的值");
		}
	}

	public static void add() throws ArithmeticException{
		int num1 = 0;
		int num2 = 33;
		int num3 = num2/num1;
	}
}