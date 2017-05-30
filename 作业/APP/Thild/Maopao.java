import java.util.Scanner;
public class Maopao{
	public static void main(String args []){
		System.out.print("请输入5个数字冒泡法排序");
		Scanner sc = new Scanner(System.in);
		int a []  = new int[]{1,5,3,6,7};
		int i,j,t;
		for(t=0;t<5;t++){
		    a[t] =sc.nextInt();
		}
		for(j=0;j<5;j++){
			for(i=0;i<4-1;i++){
				if(a[i]>a[i+1]){
					t=a[i];
					a[i]=a[i+1];
					a[i+1]=t;
				}
			}
		}
		for(t=0;t<5;t++){
			System.out.print(a[t]+"\t");
		}
	}
}