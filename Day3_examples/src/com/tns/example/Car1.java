package com.tns.example;

public class Car1 {
	String a;
	Car1(String st)
	{
		a=st;
	}
	
    void display()
    {
    	System.out.println("This is "+a);
    	
    }
    
	public static void main(String[] args) {
		Car1 c=new Car1("Audi");
		c.display();
		Car1 c1=new Car1("BMW");
		c1.display();
		Car1 c2=new Car1("Mercedes-Benze");
		c2.display();
	}

}
