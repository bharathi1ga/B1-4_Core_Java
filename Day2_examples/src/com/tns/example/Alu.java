package com.tns.example;
import java.util.Scanner;

public class Alu {

	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	System.out.println("Addition of two numbers "+(a+b));
	System.out.println("Subtraction of two numbers "+(a-b));
	System.out.println("Multiplication two numbers "+(a*b));
	System.out.println("Division of two numbers "+(a/b));
	System.out.println("Modulus of two numbers "+(a%b));
	s.close();
		// TODO Auto-generated method stub

	}

}
