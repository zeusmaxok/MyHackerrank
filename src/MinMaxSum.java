import java.util.Scanner;

public class MinMaxSum {

static void miniMaxSum(int[] arr) {
        
        long min = Long.MAX_VALUE;
        long max = 0;
        long sum = 0;
        long maxSum = 0,
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

        System.out.println(minSum + " " + maxSum);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }

}
