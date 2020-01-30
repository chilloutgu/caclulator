package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator cal;

	@Before
	public void setup() {
		cal = new Calculator();
		System.out.println("before");
	}
	@Test
	public void add() {
		assertEquals(3, cal.add(1, 2));
		System.out.println("add");
	}
	
	@Test
	public void substract() {
		assertEquals(3, cal.substract(5, 2));
		System.out.println("substract");
	}
	
	@Test
	public void multiply() {
		assertEquals(6, cal.multiply(2, 3));
		System.out.println("multiply");
	}
	
	@Test
	public void divide() {
		assertEquals(3, cal.divide(12, 4));
		System.out.println("divide");
	}
	
	@After
	public void teardown() {
		System.out.println("teardown");
	}
}

