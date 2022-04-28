package com.tns.lambda;
interface A
{
	void show();
}
public class Lambda1 {
	
	/*class Xyz implements A
	{
		public void show()
		{
			System.out.println("Welcome to Lamda expression");
		}
	}*/

	public static void main(String[] args) {
		 A obj=()->
		 {
			 System.out.println("Welcome to Lambda expression");
		 };
		 obj.show();
		
	}

}
