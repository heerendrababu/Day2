package com.kmss.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompareTwoStringsTest {

	@Test
	void test()
	{
		CompareTwoStrings c = new CompareTwoStrings();
		String result = c.stringCompare("Hi", "hello");
		assertEquals("Two strings are not same", result);
		System.out.println(result);
	}

}
