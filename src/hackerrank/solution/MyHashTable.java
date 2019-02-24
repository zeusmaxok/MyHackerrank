package hackerrank.solution;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Hashtable;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class MyHashTable {

	static void checkMagazine(String[] magazine, String[] note) {

		if (magazine.length < note.length) {
			System.out.println("No");
			return;
		}

		Hashtable<String, Integer> h1 = new Hashtable<>();

		for (String str : magazine) {
			//1.
			if (h1.containsKey(str)) {
				h1.put(str, h1.get(str) + 1);
			} else {
				h1.put(str, 1);
			}
			
			//2. h1.merge(str, 1, Integer::sum); remapping function
			
			//3. h1.put(str, h1.getOrDefault(str, 0) +1);
			
			//4. h1.merge(str, 1, (k, v) -> k +v);
			h1.merge(str, 1, (k, v) -> k +v);	

		}
		
		h1.keySet();

		for (String str : note) {

			if (!h1.containsKey(str) || h1.get(str) == 0) {
				System.out.println("No");
				return;
			}

			h1.put(str, h1.getOrDefault(str, 0));
		}

		System.out.println("Yes");
		return;
	}

	private static File file = new File("D:\\workspace\\abc.txt");

	public static void main(String[] args) {

		Scanner scanner;
		try {
			scanner = new Scanner(file);

			String[] mn = scanner.nextLine().split(" ");

			int m = Integer.parseInt(mn[0]);

			int n = Integer.parseInt(mn[1]);

			String[] magazine = new String[m];

			String[] magazineItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < m; i++) {
				String magazineItem = magazineItems[i];
				magazine[i] = magazineItem;
			}

			String[] note = new String[n];

			String[] noteItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				String noteItem = noteItems[i];
				note[i] = noteItem;
			}

			checkMagazine(magazine, note);

			scanner.close();
						
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
