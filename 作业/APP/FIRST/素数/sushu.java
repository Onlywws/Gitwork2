public class sushu {
      public static void main(String[] args){
       int i,a,flag;
	   
	   for(a=2;a<=100;a++){
	      for(i=2,flag=1;i<a;i++){
	         if(a%i==0){
		        flag=0;
	           }
		 }
	     if(flag==1){
                      System.out.print(i+"is yes\n");
		 }else{
		        System.out.print(i+"is no\n");
		 }
      }
   }
}