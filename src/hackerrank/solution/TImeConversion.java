package hackerrank.solution;

import java.util.Scanner;



/**
 * @author zeusmaxok
 * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 *
 * Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. 
 * Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock
 */
public class TImeConversion {
	
    static String timeConversion(String s) {
        
        String h = s.substring(0, 2);

        int hour = Integer.parseInt(h);

        if(s.substring(s.length()-2).equalsIgnoreCase("PM")) {
        	hour = hour <= 11 ? hour + 12 : hour;
        }else{
        	hour = hour == 12 ? 0 : hour;
        }

        return hour < 10 ? "0" + Integer.toString(hour) + s.substring(2, s.length() - 2) : Integer.toString(hour) + s.substring(2, s.length() - 2);
     }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(timeConversion(str));
		
		sc.close();
	}
}
