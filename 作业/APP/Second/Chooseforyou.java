import java.util.Scanner;
public class Chooseforyou{
	public static void main(String [] args){
		System.out.println("输入今天星期几");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch(a){
			case 1:
				System.out.println("今天星期一");
			    break;
			case 2:
				System.out.println("今天星期二");
			    break;
			case 3:
				System.out.println("今天星期三");
				break;
			case 4:
				System.out.println("今天星期四");
				break;
			case 5:
				System.out.println("今天星期五");
				break;
			case 6:
				System.out.println("今天星期六");
				break;
			case 7:
				System.out.println("今天星期日");
				break;
				default : System.out.println("输入有误");
				}
	}
}