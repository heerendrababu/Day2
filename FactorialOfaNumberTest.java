package com.kmss.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialOfaNumberTest {

	@Test
	void test()
	{
		FactorialOfaNumber f= new FactorialOfaNumber();
		int result = f.getFactorial(6);
		assertEquals(720, result);
		System.out.println(result);
	}

}
