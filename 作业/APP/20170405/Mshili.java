public class Mshili{
	public static void main(String [] args){
		Singleton.print();
	}
}

enum Singleton{
	INSTANCE;//唯一实例

	public void print(){
		System.out.println("使用enum实现单例模式");
	}
	public static Singleton getInstance(){
		return INSTANCE;
	}
}
