package sef.ATestTask.SecondActivity;
// Complete Code

import static org.junit.Assert.*;
import org.junit.*;

public class SecondActivityTest {

	// TODO try to achieve 100% of test coverage

	private SecondActivity theCalculator;

	@Before
	public void setUp() throws Exception {
		// Initialize variables to be used here
		theCalculator = new SecondActivity();
	}

	@After
	public void tearDown() throws Exception {
	}

	// Example ->
	@Test
	public void testGetSumPositiveValue() {
		assertEquals(15, theCalculator.sum(5, 10), 0.000000000001);
		assertEquals(15, theCalculator.sum(10, 5), 0.000000000001);
	}

	// Example ->
	@Test
	public void testGetSumNegativeValue() {
		assertEquals(5, theCalculator.sum(-5, 10), 0.000000000001);
		assertEquals(-5, theCalculator.sum(5, -10), 0.000000000001);
	}
	
	@Test
	public void testGetSubtractPositiveValue() {
		assertEquals(-5, theCalculator.subtract(5, 10), 0.000000000001);
		assertEquals(5, theCalculator.subtract(10, 5), 0.000000000001);
	}

	// Example ->
	@Test
	public void testGetSubtractNegativeValue() {
		assertEquals(-15, theCalculator.subtract(-5, 10), 0.000000000001);
		assertEquals(15, theCalculator.subtract(5, -10), 0.000000000001);
	}
	
	@Test
	public void testGetMultiplyPositiveValue() {
		assertEquals(50, theCalculator.multiply(5, 10), 0.000000000001);
		assertEquals(50, theCalculator.multiply(10, 5), 0.000000000001);
	}

	// Example ->
	@Test
	public void testGetMultiplyNegativeValue() {
		assertEquals(-50, theCalculator.multiply(-5, 10), 0.000000000001);
		assertEquals(-50, theCalculator.multiply(5, -10), 0.000000000001);
	}
	
	@Test
	public void testGetDividePositiveValue() {
		assertEquals(0.5, theCalculator.divide(5, 10), 0.000000000001);
		assertEquals(2, theCalculator.divide(10, 5), 0.000000000001);
	}

	// Example ->
	@Test
	public void testGetDivideNegativeValue() {
		assertEquals(-0.5, theCalculator.divide(-5, 10), 0.000000000001);
		assertEquals(-0.5, theCalculator.divide(5, -10), 0.000000000001);
	}
}
