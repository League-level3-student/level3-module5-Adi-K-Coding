package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionMathTest {

	@Test
	public void testMultiplication() {
		assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
		assertEquals(20, RecursionMath.recursiveMultiplication(2, 10));
		assertEquals(20, RecursionMath.recursiveMultiplication(10, 2));
		assertEquals(1, RecursionMath.recursiveMultiplication(1, 1));
		assertEquals(20, RecursionMath.recursiveMultiplication(5, 4));
		assertEquals(0, RecursionMath.recursiveMultiplication(0, 8));
		assertEquals(0, RecursionMath.recursiveMultiplication(8, 0));
		// Add more JUnit tests like the one above to test your method

	}

	@Test
	public void testDivision() {
		// Add JUnit tests to test your method
		assertEquals(5, RecursionMath.recursiveDivision(20, 4));
		assertEquals(0, RecursionMath.recursiveDivision(20, 0));
		assertEquals(5, RecursionMath.recursiveDivision(5, 1));
		assertEquals(1, RecursionMath.recursiveDivision(1, 1));
		assertEquals(12, RecursionMath.recursiveDivision(48, 4));
		assertEquals(13, RecursionMath.recursiveDivision(26, 2));
		assertEquals(4, RecursionMath.recursiveDivision(1000, 250));
	}

	@Test
	public void testPower() {
		// Add JUnit tests to test your method
		assertEquals(1, RecursionMath.recursivePower(1, 1));
		assertEquals(1, RecursionMath.recursivePower(1, 0));
		assertEquals(0, RecursionMath.recursivePower(0, 1));
		assertEquals(1, RecursionMath.recursivePower(1, 1));
		assertEquals(5, RecursionMath.recursivePower(5, 1));
		assertEquals(64, RecursionMath.recursivePower(4, 3));
		assertEquals(9, RecursionMath.recursivePower(3, 2));
		assertEquals(729, RecursionMath.recursivePower(9, 3));
		assertEquals(4096, RecursionMath.recursivePower(8, 4));
	}
}
