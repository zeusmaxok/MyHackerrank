package hackerrank.solution;

public class DivisorSum {
	
	public int sum(int x) {
		
		int sum = 0;
		int m = 1;
		
		while(m <= x) {
			if(x%m == 0) {
				sum += m;				
			}
			m++;
		}		
		return sum;
	}

}
