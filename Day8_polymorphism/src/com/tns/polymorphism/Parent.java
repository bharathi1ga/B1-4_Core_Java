package com.tns.polymorphism;

 class Base {
void method1()
{
	System.out.println("parent1");
}
 }
class derived extends Base
{
	void method1()
	{
		System.out.println("child");
		
	}
}
class Parent
{

	public static void main(String[] args) {
		Base b=new Base();
		b.method1();
		derived d=new derived();
		d.method1();

	}

}
