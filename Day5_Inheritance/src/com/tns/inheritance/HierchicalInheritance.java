package com.tns.inheritance;
class CellPhones
{
	void message()
	{
		System.out.println("Hi,Bharathi");
	}

  void call()
{
	System.out.println("I am calling chandana");	
}
}
class SamsungGalaxyM31 extends CellPhones
{
	void facelock()
	{
		System.out.println("Modern Facelock");
	}
}
class OnePlus extends CellPhones
{
	void games()
	{
		System.out.println("Pub-G");	
	}
}
public class HierchicalInheritance {

	public static void main(String[] args) {
		OnePlus o=new OnePlus();
		o.message();
		o.call();
		
	}

}
