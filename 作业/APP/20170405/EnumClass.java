public class EnumClass{
	public static void  main(String [] args ){
		EnumDemo ed = EnumDemo.ON;
		System.out.println(ed);//取值
		System.out.println(ed.name());//返回枚举类实例名称
		System.out.println(ed.ordinal());//返回枚举的索引
	}
}

//定义枚举类
enum EnumDemo{
	ON,OFF  //相当于定义的字段
}

