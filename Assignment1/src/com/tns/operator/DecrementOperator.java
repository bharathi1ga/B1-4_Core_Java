package com.tns.operator;

public class DecrementOperator {

	public static void main(String[] args) {
		int a=5,b=3;
		int x=--a;//4
		int y=b--;//3
		int z=b-x;//2-4=-2
		System.out.println(z);
	}

}
