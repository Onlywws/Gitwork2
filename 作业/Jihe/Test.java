package com.Jihe;

import java.util.*;


public class Test {
	public static void main(String args []){
		Map map = new HashMap();
		map.put(1, 3);
		map.put(2, 3);
		map.put(3, 3);
		map.put(4, 3);
		//Set set =  map.entrySet();
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry me = (Map.Entry)it.next();
			System.out.print(me.getKey()+"\t");
			System.out.println(me.getValue());
		}
	}
}
