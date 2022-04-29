package com.tns.annotation;
class Parent12
{
	@Deprecated
	void print()
	{
		System.out.println("Hey guys!");
	}
	@Deprecated
	void print1()
	{
		System.out.println("Hurrah!");
	}
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Parent12 p=new Parent12();
       p.print1();
	}

}
