package com.tns.looping;

public class Enhancedfor {

	public static void main(String[] args) 
	{
	   char s[]= {'a','b','c','b','e'};
	   for(int var:s)
	   {
		   
		   System.out.print((char)var+" ");
		   System.out.print(var+" ");
		   int var1=var-32;
		   System.out.print((char)var1+" ");
		   System.out.print(var1+" ");
		  
	   }
	}

}
