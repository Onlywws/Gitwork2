public class MeiJK{
	public static void main(String [] args){
		Color.RED.show();
		Color.GREEN.show();
		Color.BLUE.show();
	}
}

interface I{
	void show();
}

enum Color implements I{
    RED(){
		public void show(){
			System.out.println("��ɫ");
        }
    }, 
	GREEN(){
		public void show(){
			System.out.println("��ɫ");
        }
    }, 
	BLUE(){
		public void show(){
			System.out.println("��ɫ");
        }
    };
}

/*
enum Color implements I{
	RED(),GREEN(),BLUE();
	public void show(){
		System.out.println("��ɫ");
	}
}
*/