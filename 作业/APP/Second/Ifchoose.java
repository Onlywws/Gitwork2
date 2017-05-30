import java.util.Scanner;
public class Ifchoose{
	public static void main(String[]args){
		int a;
		System.out.println("输入两个数，然后选择对它们进行1加2减3乘4除运算");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		int q = sc.nextInt();
		int k = sc.nextInt();
		if(k==1){
			a=j+q;
			System.out.println("两数的和为"+a);
		}
		if(k==2){
			a=j-q;
			System.out.println("两数的差为"+a);
		}
		if(k==3){
			a=j*q;
			System.out.println("两数的积为"+a);
		}
		if(k==4){
			a=j/q;
			System.out.println("两数的商为"+a);
		}
		if(k>4){
			System.out.println("输入有误");
		}
	}
}