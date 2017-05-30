class Demo
{
	public static void main(String [] args){
		outClass oc = new outClass();
		oc.show();
	}
}
class  outclass{
	private String name = "大名";
	class innerclass{
		public void say(){
			System.out.println("我是内部类大名"+name);
		}
	}
	public void show(){
		innerClass ic = new innerClass();
		ic.say();
	}
}