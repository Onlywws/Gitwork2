public class Dinanao
{

	String name;
	int price;
	String xitong;
	String company;


	public void look(){
		System.out.println("It can look");
	}
	public void funcation(){
		System.out.println("It can use");
	}
	public void play(){
		System.out.println("It can play");
	}
	public void speak(){
		System.out.println("It is "+name+" and "+price+"гд and "+xitong+" and "+company);
	}


	public Dinanao(String name,int price,String xitong,String company){
		this.name=name;
		this.price=price;
		this.xitong=xitong;
		this.company=company;
	}

}