package com.tns.annotation;
class Parent
{
	void accept()
	{
		System.out.println("Parent Class");
	}
}
class Child extends Parent
{
	@Override  //trows error
	void accept()
	{
		System.out.println("Child Class");
	}
}
public class Example1 {

	public static void main(String[] args) {
		Child c=new Child();
		
		c.accept();

	}

}
