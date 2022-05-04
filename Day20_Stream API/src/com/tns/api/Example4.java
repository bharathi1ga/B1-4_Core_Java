package com.tns.api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example4 {

	public static void main(String[] args) {
		@Test
		void print()
		{
			List<String>values=Arrays.asList("Shiwani","chandana","Bharathi");
			Optional<String>var=values.stream().findAny();
			assertTrue(var.isPresent());
			assertTrue(var.get(),anyof(is("Bharathi")));
		}
	}

	
		
	}

}
