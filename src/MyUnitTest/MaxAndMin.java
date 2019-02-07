package MyUnitTest;

public class MaxAndMin {
	
	public int maxSum(int[] arr) {
        
        int min = Integer.MAX_VALUE;
        int max = 0;
        int sum = 0;
        int maxSum = 0,
             minSum = 0;

        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            
            if(min > arr[i]){
                min = arr[i];
            }

            sum += arr[i];
        }

        maxSum = sum - min;
        minSum = sum - max;

        
        return maxSum;
    }
	
	public int minSum(int[] arr) {
        
        int min = Integer.MAX_VALUE;
        int max = 0;
        int sum = 0;
        int maxSum = 0,
             minSum = 0;

        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            
            if(min > arr[i]){
                min = arr[i];
            }

            sum += arr[i];
        }

        maxSum = sum - min;
        minSum = sum - max;

        
        return minSum;
    }
	
	
	public int square(int num) {
		return num*num;
	}
}
