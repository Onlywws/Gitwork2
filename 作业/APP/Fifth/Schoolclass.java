public class Schoolclass
{

	public static void main(String[]args){
		Schoolclass [] a = new Schoolclass[3];
		Schoolclass school1 = new Schoolclass("临沂第十九中学",6666,"教学楼");
		a[0] = school1;
		Schoolclass school2 = new Schoolclass("临沂第十八中学",5555,"宿舍楼");
		a[1] = school2;
		Schoolclass school3 = new Schoolclass("山东交通技师学院",4444,"餐厅");
		a[2] = school3;

		for(int i=0;i<a.length;i++){
			a[i].speak();
			a[i].after();
		}

	}

	String schoolname;
	int area;
	String tall;

	public void teach(){
		System.out.println("teaching");
	}
	public void after(){
		System.out.println("afterschool");
	}
	public void speak(){
		System.out.println("MY school is"+schoolname+" in "+" linyi "+tall);
	}

	public Schoolclass(String schoolname,int area,String tall){
		this.schoolname=schoolname;
		this.area=area;
		this.tall=tall;
	}
}