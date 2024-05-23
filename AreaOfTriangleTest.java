package com.kmss.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AreaOfTriangleTest {

	@Test
	void test() 
	{
		AreaOfTriangle a = new AreaOfTriangle();
		float result = a.area(10, 5);
		assertEquals(25, result);
		System.out.println(result);
	}

}
