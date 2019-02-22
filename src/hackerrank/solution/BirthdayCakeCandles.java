package hackerrank.solution;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;




/**
 * @author zeusmaxok
 * You are in charge of the cake for your niece's birthday and have decided the cake 
 * will have one candle for each year of her total age. When she blows out the candles, 
 * she¡¯ll only be able to blow out the tallest ones. Your task is to find out how many 
 * candles she can successfully blow out.
 */
public class BirthdayCakeCandles {
	// Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {

        int c = 0, max = 0;

        for(int a: ar){
            if(c < a){
                c = a;
                max = 1;
            }else if(c == a){
                max++;
            }
        }

        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
