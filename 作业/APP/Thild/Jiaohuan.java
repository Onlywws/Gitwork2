public class Jiaohuan{
	public static void main(String args[]){
		int a;int b;
		a=12;b=24;
		swep(a,b);
		System.out.println("a="+a+",b="+b);
	}
	public static void swep(int a,int b){
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a+",b="+b);
	}
}