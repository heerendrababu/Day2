package com.kmss.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciSequenceTest {

	@Test
	void test()
	{
	 FibonacciSequence f = new FibonacciSequence();
	 int result = f.getSeries(5);
	 assertEquals(8, result);
	}

}
