package calculator;

public class StringCalculator {
	
	public int add(String text) {
		if(text == null || text.isEmpty()) {
			return 0;
		}
		
		String[] tokens = text.split(",");
		
		return sum(tokens);
	}
	
	private int sum(String[] tokens) {
		int sum = 0;
		
		for(String token : tokens) {
			sum += Integer.parseInt(token);
		}
		
		return sum;
	}
}
