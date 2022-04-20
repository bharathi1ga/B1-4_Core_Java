package com.tns.interface1;

class Main implements Example1
{
	public void display() {
		System.out.println("Hey Guys,What's going on?");
		
	}
	public static void main(String args[])
	{
		Main n=new Main();
	    n.display();
	}
}