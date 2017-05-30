import java.util.*;
public class Mima{
	public static void main(String args []){
		System.out.println("请输入您的密码");
		int a=0,b=0,c=0,sum=0;
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] x = new char[s.length()];
		for(int i=0;i<s.length();i++){
			x[i] = s.charAt(i);
			if(x[i]>='0' && x[i]<='9'){
				a=1;
			}
			if(x[i]>='A' && x[i]<='z'){
				b=1;
			}
			if(x[i]>=33 && x[i]<=47){
				c=1;
			}
		}
		sum=a+b+c;
		if(sum==3){
			System.out.print("密码安全等级为高级");
		}else if(sum==2){
			System.out.println("密码安全等级为中级");
		}else if(sum==1){
			System.out.println("密码安全等级为低级");
		}
		
	}
} 
