public class Jishu{
	public static void main(String args[]){
		int a,sum;
		sum=0;
		for(a=100;a<=200;a++){
			if(a%2!=0){
				sum=sum+a;
			}
		}System.out.print("100到200的奇数和为"+sum);
	}
}