package com.tns.example;

public class Car1 {
	String a;
	Car1(String st)
	{
		a=st;
	}
	
    void display()
    {
    	System.out.print("This is ");
    	System.out.println(a);
    }
    void display1()
    {
    	System.out.print("This is ");
    	System.out.println(a);
    }
    void display2()
    {
    	System.out.print("This is ");
    	System.out.println(a);
    }
	public static void main(String[] args) {
		Car1 b=new Car1("Audi");
		b.display();
		Car1 c=new Car1("BMW");
		c.display1();
		Car1 d=new Car1("Mercedes");
		d.display2();
	}

}
