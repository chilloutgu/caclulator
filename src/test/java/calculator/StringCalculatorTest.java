package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	
	private StringCalculator cal;
	
	@Before
	public void setup() {
		cal = new StringCalculator();
	}
	
	@Test
	public void add_null_or_empty() {
		assertEquals(0, cal.add(null));
		assertEquals(0, cal.add(""));
	}
	
	@Test
	public void add_숫자하나() {
		assertEquals(3, cal.add("3"));
		assertEquals(2, cal.add("2"));
	}
	
	@Test
	public void add_쉼표구분자() {
		assertEquals(3, cal.add("1,2"));
		assertEquals(5, cal.add("2,3"));
	}
	
	@Test
	public void add_콜론구분자() {
		assertEquals(7, cal.add("3:4"));
		assertEquals(8, cal.add("2,1:5"));
	}
	
	@Test(expected = RuntimeException.class)
	public void add_negative() throws Exception {
		cal.add("-1,3");
		cal.add("-2:5");
		cal.add("-3,5:7");
	}
 }
