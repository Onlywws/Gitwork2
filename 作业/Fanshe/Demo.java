package com.Fanshe;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Demo implements Serializable {
	/*public static void main(String [] args) throws Exception{
		Class<?> class1 = null;
		class1 = Class.forName("com.Fanshe.Demo");
		//��һ�ַ�����ʵ����Ĭ�Ϲ��췽��������set��ֵ
		User user = (User)class1.newInstance();
		user.setAge(20);
		user.setName("Rollen");
		//��� User [age=20,name=Rollen]
		//�ڶ��ַ��� ȡ��ȫ���Ĺ��캯�� ʹ�� ���캯����ֵ
		Constructor<?> cons[] = class1.getConstructors();
		//�鿴ÿ�����췽����Ҫ�Ĳ���
		for(int i = 0;i<cons.length;i++){
		
		
		
	}*/
	
	
	
	
	
	
    /*private static final long serialVersionUID = -2862585049955236662L;
    
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.Fanshe.+Demo");
        Method method[] = clazz.getMethods();
        for (int i = 0; i < method.length; ++i) {
            Class<?> returnType = method[i].getReturnType();
            Class<?> para[] = method[i].getParameterTypes();
            int temp = method[i].getModifiers();
            System.out.print(Modifier.toString(temp) + " ");
            System.out.print(returnType.getName() + "  ");
            System.out.print(method[i].getName() + " ");
            System.out.print("(");
            for (int j = 0; j < para.length; ++j) {
                System.out.print(para[j].getName() + " " + "arg" + j);
                if (j < para.length - 1) {
                    System.out.print(",");
                }
            }
            Class<?> exce[] = method[i].getExceptionTypes();
            if (exce.length > 0) {
                System.out.print(") throws ");
                for (int k = 0; k < exce.length; ++k) {
                    System.out.print(exce[k].getName() + " ");
                    if (k < exce.length - 1) { 
                        System.out.print(",");
                    }
                }
            } else {
                System.out.print(")");
            }
            System.out.println();
        }
    }*/
    
    
    /*public static void main(String[] args) throws Exception {
	    Class<?> clazz = Class.forName("com.Fanshe.Demo");
	    // ȡ�ø���
	    Class<?> parentClass = clazz.getSuperclass();
	    System.out.println("clazz�ĸ���Ϊ��" + parentClass.getName());
	    // clazz�ĸ���Ϊ�� java.lang.Object
	    // ��ȡ���еĽӿ�
	    Class<?> intes[] = clazz.getInterfaces();
	    System.out.println("clazzʵ�ֵĽӿ��У�");
	    for (int i = 0; i < intes.length; i++) {
	        System.out.println((i + 1) + "��" + intes[i].getName());
	    }
	    // clazzʵ�ֵĽӿ��У�
	    // 1��java.io.Serializable
	}*/
    

/*{
	public static void main(String[]args) throws ClassNotFoundException{
		 	Class<?> class1 = null;
	        Class<?> class2 = null;
	        Class<?> class3 = null;
	        // һ�����������ʽ
	        class1 = Class.forName("com.Fanshe.Demo");
	        class2 = new Demo().getClass();
	        class3 = Demo.class;
	        System.out.println("������   " + class1.getName());
	        System.out.println("������   " + class2.getName());
	        System.out.println("������   " + class3.getName());
	}*/
}
