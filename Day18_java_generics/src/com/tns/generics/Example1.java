package com.tns.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {

	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("Bharathi");
		a.add("Prajwal");
		//a.add(20);//errror
		//Type casting
		//String s=a.get(1);
		//System.out.println(s);
		Iterator<String> itr=a.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}

	}

}
