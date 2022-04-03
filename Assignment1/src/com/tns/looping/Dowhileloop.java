package com.tns.looping;

import java.util.Scanner;


public class Dowhileloop {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0,i=1;
		do
		{
			sum=sum+i;
			System.out.print(sum+" ");
			i++;
		}
		while(i<=n);
		s.close();

	}

}
