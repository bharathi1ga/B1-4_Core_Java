package com.tns.exception;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int res=a/0;
		System.out.println(res);
		s.close();

	}

}
