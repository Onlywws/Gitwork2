import java.util.*;
public class SanDemo{
	public static void main(String [] args) throws Exception{
		SanDemo w = new SanDemo();
		try{
			w.out();
		}catch(Exception p){
			p.printStackTrace();
			System.out.println("异常信息");
		}
	}
	
	public void out()throws MyException{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一条边边长");
		int a = sc.nextInt();
		System.out.println("请输入第二条边边长");
		int b = sc.nextInt();
		System.out.println("请输入第三条边边长");
		int c = sc.nextInt();
		if (a+b>c && a+c>b && b+c>a){
			System.out.println("可以构成三角形");
		}
		else{
			throw new MyException("不可以构成三角形");
		}
	}
}

class MyException extends Exception{
    public MyException() {
        super();
    }    
    public MyException(String message){
        super(message);
    }
}