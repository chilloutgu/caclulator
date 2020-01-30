package calculator;

public class StringCalculator {
	
	public int add(String text) {
		if(text == null || text.isEmpty()) {
			return 0;
		}
		
		String[] tokens = text.split(",");
		
		return sum(toInts(tokens));
	}
	
	private int[] toInts(String[] tokens) {
		int[] numbers = new int[tokens.length];
		
		for(int i=0; i<tokens.length; i++) {
			numbers[i] = Integer.parseInt(tokens[i]);
		}
		
		return numbers;
	}
	
	private int sum(int[] numbers) {
		int sum = 0;
		
		for(int number : numbers) {
			sum += number;
		}
		
		return sum;
	}
}
