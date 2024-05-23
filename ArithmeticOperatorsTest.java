package com.kmss.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArithmeticOperatorsTest {

	@Test
	void test()
	{
		ArithmeticOperators a = new ArithmeticOperators();
      int result = a.method(6, 2, '/');
      assertEquals(3, result);
      System.out.println(result);
	}

}
