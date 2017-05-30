public class wanshu{
     public static void main(String[]args){
     int a,b,sum;
	 for(a=1;a<100;a++){
	  for(b=1,sum=0;b<a;b++){
		  if(a%b==0){
			sum=sum+b;
			}
	  }
	  if(sum==a){
	  System.out.print(sum+"\n");
			}
		}
	}
}