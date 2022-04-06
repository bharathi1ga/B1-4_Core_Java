package com.tns.polymorphism;

public class Overloading1 {
	 void assign(float a,float b)
	  {
		  System.out.println("Area of rectangle "+(a*b));
		  
	  }
	 void assign(int a)
	  {
		  System.out.println("Area of square "+(a*a));
		  
	  }
	public static void main(String[] args) {
		Overloading1 o=new Overloading1();
		o.assign(5f,10f);
		o.assign(10);
		// TODO Auto-generated method stub

	}

}
