package com.tns.example;

public class Constructor
{
String str;
int a;
Constructor(String st,int x)
{
	str=st;
	a=x;
}
void display()
{
	System.out.println(str+" "+a);
	
}
public static void main(String[] args) {
	
	Constructor c=new Constructor("Bharathi",55);
	c.display();
}
}


