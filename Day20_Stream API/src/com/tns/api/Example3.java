package com.tns.api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example3 {

	public static void main(String[] args) {
		List<Integer>values=Arrays.asList(2,5,8,16);
		Optional<Integer>var=values.stream().reduce((a,b)->a+b);
		if(var.isPresent())
		{
			System.out.println("Result: "+var.get());
		}

	}

}
