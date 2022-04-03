package com.tns.decisionmaking;

public class Cascade_ifelse {

	public static void main(String[] args) 
	{
		int a=45,b=34,c=12;
		  if(a>b && a>c)
		  {
			  System.out.println(a);
		  }
		  else if(b>a && b>c) 
		  {
			  System.out.println(b); 
		  }
		  else
		  {
			  System.out.println(c);  
		  }

	}

}
