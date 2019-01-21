import java.util.Scanner;

/*
 * Objective 
Today, we're building on our knowledge of Arrays by adding another dimension. Check out the Tutorial tab for learning materials and an instructional video!

Context 
Given a  2D Array, :

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
We define an hourglass in  to be a subset of values with indices falling in this pattern in 's graphical representation:

a b c
  d
e f g
There are  hourglasses in , and an hourglass sum is the sum of an hourglass' values.

Task 
Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.

1 1 1   1 1 0   1 0 0   0 0 0
  1       0       0       0
1 1 1   1 1 0   1 0 0   0 0 0

0 1 0   1 0 0   0 0 0   0 0 0
  1       1       0       0
0 0 2   0 2 4   2 4 4   4 4 0

1 1 1   1 1 0   1 0 0   0 0 0
  0       2       4       4
0 0 0   0 0 2   0 2 0   2 0 0

0 0 2   0 2 4   2 4 4   4 4 0
  0       0       2       0
0 0 1   0 1 2   1 2 4   2 4 0
 */


public class HourGlass {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        maxHourGlassSum(arr);

        scanner.close();
    }

    private static void maxHourGlassSum(int[][] arr){
        int row = arr.length -2;
        int column = arr[0].length -2;

        int maxSum = 0;

        for(int i = 1; i < row+1; i++){
            for(int j = 1; j < column+1; j++){
                int temp = arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1]
                            + arr[i][j]
                            + arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1];

                //System.out.print(sum[index] + " ");
                
                System.out.print(temp + " ");

                if(temp >= 0){
                    if(temp > maxSum){
                        maxSum = temp;
                    }
                }else if(temp < 0){
                    if(i == 1 && j == 1){
                        maxSum = -Integer.MAX_VALUE;
                    }

                    if(temp > maxSum){
                        maxSum = temp;
                    }
                }


            }    
        }                
        
        System.out.println(maxSum);
    }

}
