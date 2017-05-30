class SnakeDemo {
	private String name = "外部类属性";
	private class Node {
		private String name="内部类属性";
		public void  addTail(){
			String name ="局部变量";
			System.out.println("把"+name+"添加到尾巴");
			System.out.println("把"+this.name+"添加到尾巴");
			System.out.println("把"+SnakeDemo.this.name+"添加到尾巴");
		}
	}
	public void show(){
		new Node().addTail();
	}
}

public class Snake
{
	public static void main(String[] args){
		new SnakeDemo().show();
	}
}