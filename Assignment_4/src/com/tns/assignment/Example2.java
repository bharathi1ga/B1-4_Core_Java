package com.tns.assignment;

public class Example2 {
	static int nopath(int m,int n)
    {
    	if(m==1||n==1)
    	return 1;
    	return nopath(m-1,n)+nopath(m,n-1);
    }
	public static void main(String[] args) {
		System.out.print("Output : ");
		System.out.println(nopath(2,3));
	}

}
