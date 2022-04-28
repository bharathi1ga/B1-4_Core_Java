package com.tns.lambda;
interface D
{
	int mul(int x,int y);
}
public class Lambda6 {

	public static void main(String[] args) {
		//Lambda Expression without return type
		D obj=(x,y)->(x*y);
		System.out.println("Multiplication of two numbers is: "+obj.mul(20,34));
			
		
		
		
	}

}
