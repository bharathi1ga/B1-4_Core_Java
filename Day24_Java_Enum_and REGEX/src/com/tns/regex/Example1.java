package com.tns.regex;

import java.util.regex.Pattern;

public class Example1 {

	public static void main(String[] args) {
		String pattern="Bharathi S";
		String input="Bharathi S";
		boolean Result=Pattern.matches(pattern,input);
		System.out.println(Result);
	}

}
