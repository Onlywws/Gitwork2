public class Person{
	public Shouji phone;
	public static void main(String [] args){
		String number = "15168900335";
		String message = "hello world";
		Shoujika shoujika = new Shoujika(number,message);
		Shouji phone = new Shouji(shoujika);
		Person people = new Person(phone);
		people.use();
	}
	public Person(Shouji phone){
		this.phone = phone;
	}
	public void use(){
		phone.call();
	}
}