package com.tns.annotation;

import java.lang.reflect.Method;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Annotation1
{
	

	int print();

	
}
class Parent2
{
	@Annotation1(print=25)
	public void display()
	{
		System.out.println("Welcome to annotation");
	}
}
class Example4
{
	public static void main(String args[]) throws Exception
	{
		Parent2 p=new Parent2();
		Method m=p.getClass().getMethod("display");
		Annotation1 a=m.getAnnotation(Annotation1.class);
		System.out.println(a.print());
;	}

}