package com.tns.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {

	public static void main(String[] args) {
		List<Integer>values=Arrays.asList(11,22,33);
		List<Integer>var=values.stream().map(i->i*i*i).collect(Collectors.toList());
		//Integer[] arr=new Integer[] {11,22,33};
		//Stream<Integer>obj=Stream.of(11,22,33);
		System.out.println(var);
	}

}
