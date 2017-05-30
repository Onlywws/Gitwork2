import java.util.Scanner;
public class Jisuanqi{
	public static void main(String [] args){
		int c,d,e,f;
		System.out.println("请输入两个数，计算它们的加减乘除");
		Scanner sc = new Scanner(System.in);
		int sca =sc.nextInt();
		int scb =sc.nextInt();
		c=sca+scb;
		d=sca-scb;
		e=sca*scb;
		f=sca/scb;
		System.out.println("这两个数的加减乘除分别是"+c+"\t"+d+"\t"+e+"\t"+f);
	}
}