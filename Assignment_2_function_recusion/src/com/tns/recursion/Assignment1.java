package com.tns.recursion;

import java.util.Scanner;

public class Assignment1 {
	static int n1=0,n2=1,n3=0;
	static void fibonacci(int n)
	{
	if(n>0)
	{
	 n3=n1+n2;
	 n1=n2;
	 n2=n3;
	 System.out.print(" "+n3);
	 fibonacci(n-1);
	}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.print(n1+" "+n2);
		fibonacci(n-2);
		s.close();
		

	}

}
