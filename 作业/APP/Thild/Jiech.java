public class Jiech{
	public static void main(String args []){
		int a,b,sum;
		a=1;
		b=1;
		sum=0;
		for(b=1;b<=10;b++){
			a=a*b;
			sum=sum+a;
		}
		System.out.println(sum);
		a=1;
		b=1;
		sum=0;
		while(b<=10){
			a=a*b;
			sum=sum+a;
			b++;
		}
		System.out.println(sum);
		a=1;
		b=1;
		sum=0;
		do{
			a=a*b;
			sum=sum+a;
			b++;
		}while (b<=10);
		System.out.println(sum);
	}
}