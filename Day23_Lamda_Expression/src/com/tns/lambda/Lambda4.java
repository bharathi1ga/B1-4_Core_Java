package com.tns.lambda;

import java.util.ArrayList;

public class Lambda4 {

	public static void main(String[] args) {
		ArrayList<Integer> obj=new ArrayList<>();
		obj.add(12);
		obj.add(22);
		obj.add(32);
		System.out.println(obj);
		obj.forEach((a)->
		{
			System.out.println(a);
		});
	}

}
