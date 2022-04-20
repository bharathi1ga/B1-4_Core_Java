package com.tns.interface1;

public interface Example2
{
	void display();
	void print();
	
}
class Main1 implements Example1
{
	public void display() {
		System.out.println("Hey Guys,What's going on?");
		
	}
	public void print() {
		System.out.println("Hey Guys,What's going on?");
	}
	public static void main(String args[])
	{
		Main1 n=new Main1();
	    n.display();
	    n.print();
	}
}
