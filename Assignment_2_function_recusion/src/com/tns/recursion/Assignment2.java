package com.tns.recursion;

import java.util.Scanner;

public class Assignment2 {

 static int addition(int n)
 {
	if(n!=0)
		return n+addition(n-1);
	else
		return n;
 }
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=addition(n);
		System.out.println("Sum = " +sum);
        s.close();
	}

}
