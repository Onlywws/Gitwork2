public class Tang{
	public static void main(String args []){
		int a,sum;
		sum=0;
		for(a=1;a<=100;a++){
			sum=sum+a;
		}
		System.out.print(sum+"\t");
		for(a=1;a<=1000;a++){
			sum=sum+a;
		}
		System.out.print(sum+"\t");
		for(a=1;a<=10000;a++){
			sum=sum+a;
		}
		System.out.print(sum+"\t");
		for(a=1;a<=100000;a++){
			sum=sum+a;
		}
		System.out.print(sum+"\t");
	}
}