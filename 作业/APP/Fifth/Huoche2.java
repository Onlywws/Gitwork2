public class Huoche2{
	public static void main(String[] args){
		Huoche2 firstcar = new Huoche2("李正利",100,88888);
		Huoche2 secondcar = new Huoche2("李祥",200,66666);
		firstcar.say();
		secondcar.say();
		firstcar.running();
		firstcar.let();
		secondcar.hit();
	}

	String name;
	int howlang;
	int howmany;

	public void running(){
		System.out.println("能开");
	}
	public void let(){
		System.out.println("载人");
	}
	public void hit(){
		System.out.println("装货");
	}
	public void say(){
		System.out.println(name+"号火车，"+"长"+howlang+"米，承载"+howmany+"人");
	}

	//构造器
	public Huoche2(String name,int howlang,int howmany){
		this.name=name;
		this.howlang=howlang;
		this.howmany=howmany;
	}
}