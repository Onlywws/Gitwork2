public class Student{

	//声明属性信息
		String name;
		int age;
		char sex;

	public static void main (String [] args){
		Student student[] = new Student[3];
		Student student1 = new Student("lizhengli",20,'男');
		student[0] = student1;
		Student student2 = new Student("lixiang",20,'男');
		student[1] = student2;
		Student student3 = new Student("zhouhongcheng",20,'男');
		student[2] = student3;
		for(int i=0;i<student.length;i++){
			student[i].say();
			student[i].sleep();
		}
	}

	

	//方法
	public void eat(){			
		System.out.println(name+"Eating");
	}
	public void drink(){
		System.out.println(name+"is Drinking");
	}
	public void run(){
		System.out.println(name+"is Running");
	}
	public void sleep(){
		System.out.println(name+"is Sleepping");
	}
	public void say(){
		System.out.println("我叫"+name+",今年"+age+"岁，性别"+sex);
	}

	//构造器
	public Student(String name,int age,char sex){
		this.name=name;
		this.age=age;
		this.sex=sex;
	}

}