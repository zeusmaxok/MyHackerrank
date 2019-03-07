package learningRecurrsion;

public class Fibonacci {
	
	public Fibonacci() {}
	
	public int getFibonacciNumber(int x) {
		
		if(x == 0) {
			return 1;
		}
		
		if(x == 1) {
			return 1;
		}
		
		return getFibonacciNumber(x-1) + getFibonacciNumber(x - 2);
	}

}
