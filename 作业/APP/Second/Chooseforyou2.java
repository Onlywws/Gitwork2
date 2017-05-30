import java.util.Scanner;
public class Chooseforyou2{
	public static void main(String [] args){
		int a,b,c,d;
		System.out.println("请输入两个数,选择1加2减3乘4除");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		int q = sc.nextInt();
		int k = sc.nextInt();
		switch(k){
			case 1:
				a=j+q;
				System.out.println("两数的和为"+a);
				break;
			case 2:
				b=j-q;
				System.out.println("两数的差为"+b);
				break;
			case 3:
				c=j*q;
				System.out.println("两数的积为"+c);
				break;
			case 4:
				d=j/q;
				System.out.println("两数的商为"+d);
				break;
			default:
				System.out.println("输入有误");
		}
	}
}