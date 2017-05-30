package com.Fanshe;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Demo implements Serializable {
	/*public static void main(String [] args) throws Exception{
		Class<?> class1 = null;
		class1 = Class.forName("com.Fanshe.Demo");
		//第一种方法，实例化默认构造方法，调用set赋值
		User user = (User)class1.newInstance();
		user.setAge(20);
		user.setName("Rollen");
		//结果 User [age=20,name=Rollen]
		//第二种方法 取得全部的构造函数 使用 构造函数赋值
		Constructor<?> cons[] = class1.getConstructors();
		//查看每个构造方法需要的参数
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
	    // 取得父类
	    Class<?> parentClass = clazz.getSuperclass();
	    System.out.println("clazz的父类为：" + parentClass.getName());
	    // clazz的父类为： java.lang.Object
	    // 获取所有的接口
	    Class<?> intes[] = clazz.getInterfaces();
	    System.out.println("clazz实现的接口有：");
	    for (int i = 0; i < intes.length; i++) {
	        System.out.println((i + 1) + "：" + intes[i].getName());
	    }
	    // clazz实现的接口有：
	    // 1：java.io.Serializable
	}*/
    

/*{
	public static void main(String[]args) throws ClassNotFoundException{
		 	Class<?> class1 = null;
	        Class<?> class2 = null;
	        Class<?> class3 = null;
	        // 一般采用这种形式
	        class1 = Class.forName("com.Fanshe.Demo");
	        class2 = new Demo().getClass();
	        class3 = Demo.class;
	        System.out.println("类名称   " + class1.getName());
	        System.out.println("类名称   " + class2.getName());
	        System.out.println("类名称   " + class3.getName());
	}*/
}
