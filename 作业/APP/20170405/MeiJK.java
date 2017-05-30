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
			System.out.println("红色");
        }
    }, 
	GREEN(){
		public void show(){
			System.out.println("绿色");
        }
    }, 
	BLUE(){
		public void show(){
			System.out.println("蓝色");
        }
    };
}

/*
enum Color implements I{
	RED(),GREEN(),BLUE();
	public void show(){
		System.out.println("红色");
	}
}
*/