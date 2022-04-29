package com.tns.junittesting;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class JUnitTesting4 
{
	@BeforeAll
	@Test
	static void display()
	{
		System.out.println("Sushmitha");
	}
	@Tag("Diya")
	@Disabled
	@Test
	void display1()
	{
		System.out.println("Bharathi");
	}


}
