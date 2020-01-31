package calculator;

public class StringCalculator {
	
	public int add(String text) {
		if(isBlank(text)) {
			return 0;
		}
		
		return sum(toInts(split(text)));
	}
	
	private boolean isBlank(String text) {
		return text == null || text.isEmpty();
	}
	
	private String[] split(String text) {
		return text.split(",|:");
	}
	
	private int[] toInts(String[] tokens) {
		int[] numbers = new int[tokens.length];
		
		for(int i=0; i<tokens.length; i++) {
			numbers[i] = Integer.parseInt(tokens[i]);
			
			checkNegative(numbers[i]);
		}
		
		return numbers;
	}
	
	private void checkNegative(int number) {
		if(number < 0) {
			throw new RuntimeException();
		}
	}
	
	private int sum(int[] numbers) {
		int sum = 0;
		
		for(int number : numbers) {
			sum += number;
		}
		
		return sum;
	}
}
