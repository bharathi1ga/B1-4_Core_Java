package com.tns.lambda;

public class Lambda8 {

	public static void main(String[] args) {
		//thread examle using lambda expression
		Runnable r1=()->
		{
			System.out.println("Class Name is: Lambda8");
		};
		Thread t=new Thread(r1);
		t.start();
	}

}
