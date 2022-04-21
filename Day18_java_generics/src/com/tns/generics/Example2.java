package com.tns.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Example2 {

	public static void main(String[] args) {
		NavigableMap<String> a=new TreeMap<String>();
		a.put("Bharathi");
		a.put("Prajwal");
		//a.add(20);//errror
		//Type casting
		//String s=a.get(1);
		//System.out.println(s);
		Iterator<String> itr=a.comparator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
	}

}
