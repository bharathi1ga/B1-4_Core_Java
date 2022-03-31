package com.tns.example;

public class Nonparameterized {
        String str;
		int a;
		Nonparameterized()
		{
			str="Bharathi";
			a=44;
		}
		void display()
		{
			System.out.println(str+" "+a);
			
		}
		public static void main(String[] args) {
			
			Nonparameterized c=new Nonparameterized();
			c.display();
		}
	}


