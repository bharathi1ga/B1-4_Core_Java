package com.tns.lambda;
interface A1
{
	void show(int i);
}
public class Lambda2 {

	public static void main(String[] args) {
		 A1 obj=(int i)->
		 {
			 System.out.println("Welcome to Lambda expression"+i);
		 };
		 obj.show(5);

	}

}
