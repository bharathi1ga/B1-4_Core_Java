package com.tns.lambda;

public class Lambda7 {

	public static void main(String[] args) {
		//Thread example without lambda expression
		Runnable R1=new Runnable()
		{

			@Override
			public void run() 
			{
				System.out.println("Class Name is: Lambda7");			
						
			}
			
		};
		Thread t=new Thread(R1);
		t.start();
		}

}
