package learning.MultiThreadExample;

import java.time.Duration;
import java.time.Instant;

class MyMultiThreadExample{

	public static void main(String[] args) {
		
		GameOne g1 = new GameOne();
		GameTwo g2 = new GameTwo();
		GameThree g3 = new GameThree();

		Thread thread1 = new Thread(g1);
		Thread thread2 = new Thread(g2);
		Thread thread3 = new Thread(g3);

		Instant start1 = Instant.now();

		thread1.start();
		
		thread2.start();
		
		thread3.start();

		Instant end1 = Instant.now();

		long elapsed = Duration.between(start1, end1).toMillis();

		int total = g1.getCount() + g2.getCount() + g3.getCount();

		System.out.println("MultiThread running cost " + elapsed + " to count " + total + " times");

		GameFour g4 = new GameFour();
		GameFive g5 = new GameFive();
		GameSix g6 = new GameSix();

		Instant start2 = Instant.now();

		g4.run();
		g5.run();
		g6.run();

		Instant end2 = Instant.now();
		
		long elapsed2 = Duration.between(start2, end2).toMillis();
		
		int total2 = g3.getCount() + g4.getCount() + g5.getCount();
		
		System.out.println("Sequential running cost " + elapsed2 + " to count " + total2 + " times");
	}

}

class GameOne implements Runnable {

	int count1 = 0;

	@Override
	public void run() {

		for (int i = 0; i < 10000000; i++) {
			// System.out.print("Game1 at round " + count + " now");
			count1++;
		}
	}

	public int getCount() {
		System.out.println("GameOne counts " + count1);
		return count1;
	}
}

class GameTwo implements Runnable {

	int count2 = 0;

	@Override
	public void run() {

		for (int i = 0; i < 10000000; i++) {
			// System.out.print("Game2 at round " + count + " now");
			count2++;
		}
	}

	public int getCount() {
		System.out.println("GameTwo counts " + count2);
		return count2;
	}
}

class GameThree implements Runnable {

	int count3 = 0;

	@Override
	public void run() {

		for (int i = 0; i < 10000000; i++) {
			// System.out.print("Game3 at round " + count + " now");
			count3++;
		}
	}

	public int getCount() {
		System.out.println("GameThree counts " + count3);
		return count3;
	}
}

class GameFour {

	int count4 = 0;

	public void run() {

		for (int i = 0; i < 10000000; i++) {
			// System.out.print("Game3 at round " + count + " now");
			count4++;
		}
	}

	public int getCount() {
		System.out.println("GameFour counts " + count4);
		return count4;
	}
}

class GameFive {

	int count5 = 0;

	public void run() {

		for (int i = 0; i < 10000000; i++) {
			// System.out.print("Game3 at round " + count + " now");
			count5++;
		}
	}

	public int getCount() {
		System.out.println("GameFive counts " + count5);
		return count5;
	}
}

class GameSix {

	int count6 = 0;

	public void run() {

		for (int i = 0; i < 10000000; i++) {
			// System.out.print("Game3 at round " + count + " now");
			count6++;
		}
	}

	public int getCount() {
		System.out.println("GameFive counts " + count6);
		return count6;
	}
}
