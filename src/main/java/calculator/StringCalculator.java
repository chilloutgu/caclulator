package calculator;

public class StringCalculator {
	
	public int add(String text) {
		if(text == null || text.isEmpty()) {
			return 0;
		}
		
		String[] tokens = text.split(",");
		
		int sum = 0;
		
		for(String token : tokens) {
			sum += Integer.parseInt(token);
		}
		
		return sum;
	}
}
