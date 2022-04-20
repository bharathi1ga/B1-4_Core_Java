package com.tns.strings;

public class Example3 {

	public static void main(String[] args) {
		//String str="Hello";  //True
		//String str1="Hello";
		String str1=new String("Hello");//Flase
		String str2=new String("Hello");
		System.out.println(str2==str1);
		System.out.println(str1.equals(str2));
	}

}
