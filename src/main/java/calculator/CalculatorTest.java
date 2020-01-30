package calculator;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		add(cal);
		substract(cal);
		multiply(cal);
		divide(cal);
		
	}
	
	private static void add(Calculator cal) {
		System.out.println(cal.add(4, 2));
	}
	
	private static void substract(Calculator cal) {
		System.out.println(cal.substract(4, 2));
	}
	
	private static void multiply(Calculator cal) {
		System.out.println(cal.multiply(4, 2));
	}
	
	private static void divide(Calculator cal) {
		System.out.println(cal.divide(4, 2));
	}
}
