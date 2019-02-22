package hackerrank.solution;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ApplesAndOranges {
	// Complete the countApplesAndOranges function below.
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

		int maxApples = 0, maxOranges = 0;

		for (int x : apples) {

			int d = a + x;

			maxApples = d >= s && d <= t ? maxApples+1 : maxApples;
		}

		for (int y : oranges) {
			
			int d = b + y;

			maxOranges = d >= s && d <= t ? maxOranges+1 : maxOranges;
		}
		
		// using Arrays.stream to convert an array to stream
		Arrays.stream(apples)
	    .filter(x -> x + a  >= s && x + a <= t)
	    .count();
		//
		Arrays.stream(oranges)
	    .filter(x -> x + b  >= s && x + b <= t)
	    .count();

		System.out.println(maxApples);
		System.out.println(maxOranges);
	}
	
	
	

	private static File file = new File("D:\\workspace\\abc.txt");

	public static void main(String[] args) {

		Scanner scanner;
		try {
			scanner = new Scanner(file);

			String[] st = scanner.nextLine().split(" ");

			int s = Integer.parseInt(st[0]);

			int t = Integer.parseInt(st[1]);

			String[] ab = scanner.nextLine().split(" ");

			int a = Integer.parseInt(ab[0]);

			int b = Integer.parseInt(ab[1]);

			String[] mn = scanner.nextLine().split(" ");

			int m = Integer.parseInt(mn[0]);

			int n = Integer.parseInt(mn[1]);

			int[] apples = new int[m];

			String[] applesItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < m; i++) {
				int applesItem = Integer.parseInt(applesItems[i]);
				apples[i] = applesItem;
			}

			int[] oranges = new int[n];

			String[] orangesItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int orangesItem = Integer.parseInt(orangesItems[i]);
				oranges[i] = orangesItem;
			}

			countApplesAndOranges(s, t, a, b, apples, oranges);

			scanner.close();

		} catch (FileNotFoundException e) {

			System.out.println("cannot finde file");
		}
	}
}
