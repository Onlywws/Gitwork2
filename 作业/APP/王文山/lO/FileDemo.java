package com.lO;

import java.io.File;
import java.io.IOException;


public class FileDemo {
	public static void main(String[] args){
		/*
		//´´½¨FileÊµÀý
		File file = new File("Test.text");
		try{
			file.createNewFile();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println("name="+file.getName());
		System.out.println("path="+file.getAbsolutePath());
		System.out.println("name="+file.getPath());
		System.out.println("parent="+file.getAbsolutePath());
		System.out.println("length="+file.length());
		
		//if(file.exists()){
		//	file.delete();
		//}
		*/
		
		/*
		File file = new File("src");
		//String[] strings = file.list();
		for(String s:strings){
			System.out.println(s);
		}
		*/
		File file = new File("src");
		File[] strings = file.listFiles();
		findFile(file);
		/*
		for(File f:strings){
			if(s.isDirectory()){
				s.listFiles(;)
			}else{
				System.out.println(s.getAbsolutePath());
			}
			
		}
		*/
	}
	
	public static void findFile(File f){
		if(f.isDirectory()){
			File[] files = f.listFiles();
			for(File f1:files){
				findFile(f1);
			}
		}else{
			System.out.println("path="+f.getAbsolutePath());
		}
	}
}

