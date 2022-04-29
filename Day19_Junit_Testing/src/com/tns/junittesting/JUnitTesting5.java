package com.tns.junittesting;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class JUnitTesting5 
{
	@Test
	void accept()
	{
		System.setProperty("1", "Bharathi");
		//Assumptions.assumeTrue("Bharathi".equals(System.getProperty("1")));
		//Assumptions.assumeTrue("Bharathi".equals(System.getProperty("2")));
		Assumptions.assumeFalse("Bharathi".equals(System.getProperty("2")));
	}

}
