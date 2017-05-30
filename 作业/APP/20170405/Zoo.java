public class Zoo{
	public static void main(String [] args){
		Dog erha = new ErHa();
		Dog taidi = new TaiDi();
		weigou(taidi);
		weigou(erha);
	}
	public static void weigou(Dog dog){
		System.out.println("ÍæÒ»»á");
		if(dog instanceof ErHa){
			((ErHa)dog).biaoqing();
		}
		if(dog instanceof TaiDi){
			((TaiDi)dog).biaoqing();
		}
		dog.eat();
	}
}