import java.util.*;
public class Jihe{
	public static void main(String [] args){
		Collection c = new ArrayList();
		c.add("孙悟空");//添加元素
		c.add(6);
		System.out.println("c集合的元素个数为："+c.size());
		c.remove(6);//删除指定的元素
		System.out.println("c集合的元素个数为："+c.size());
		System.out.println("c集合是否包含孙悟空是字符串："+c.contains("孙悟空"));
		c.add("轻量级J2ee企业应用实战");
		System.out.println("c集合的元素为："+c);
		
		
		Collection books = new HashSet();
		books.add("轻量级J2ee企业应用实战");
		books.add("Struts2权威指南");
		System.out.println("c集合是否完全包含books集合？"+c.containsAll(books));
		c.removeAll(books);//c集合减去books集合里的元素
		System.out.println("C集合的元素"+c);
		c.clear();//删除C集合里的所有元素
		System.out.println("C集合的元素"+c);
		books.retainAll(c);
		System.out.println("books集合的元素"+books);
		

	
	}
}