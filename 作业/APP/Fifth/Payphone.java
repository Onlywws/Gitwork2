public class Payphone
{

	public static void main(String[]args){
		Payphone [] phone = new Payphone[4];
		Payphone phone1 = new Payphone("小米","NOTE","MIMU",1000);
		phone[0] = phone1;
		Payphone phone2 = new Payphone("小米","NOTE2","MIMU",3000);
		phone[1] = phone2;
		Payphone phone3 = new Payphone("小米","5S","MIMU",2000);
		phone[2] = phone3;
		Payphone phone4 = new Payphone("小米","5","MIMU",1500);
		phone[3] = phone4;
		for(int i=0;i<phone.length;i++){
			phone[i].speak();
			phone[i].funcation();
		}
 	}

	String name;
	String xinghao;
	String xitong;
	int price;


	public void call(){
		System.out.println("It can call");
	}
	public void funcation(){
		System.out.println("It can pay");
	}
	public void play(){
		System.out.println("It can play");
	}
	public void speak(){
		System.out.println("It is "+name+" and "+xinghao+" and "+xitong+" and "+price+"￥");
	}


	public Payphone(String name,String xinghao,String xitong,int price){
		this.name=name;
		this.xinghao=xinghao;
		this.xitong=xitong;
		this.price=price;
	}

}