package hackerrank.solution;

import java.util.Scanner;



/**
 * @author zeusmaxok
 * HackerLand University has the following grading policy:

 * Every student receives a  in the inclusive range from 0 to 100.
 * Any grade less than 38 is a failing grade.
 * Sam is a professor at the university and likes to round each student's  according to these rules:

 * If the difference between the grade and the next multiple of 5 is less than , round grade up to the next multiple of 5.
 * If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
 */
public class GradingStudent {
	
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);
        
        for(int i = 0; i < result.length; i++) {
        	System.out.println(result[i]);
        }
	}
	
	static int[] gradingStudents(int[] grades) {
	      
        for(int i = 0; i < grades.length; i++){
            if(grades[i] < 38){
                continue;
            }else{
                int a = grades[i]%10;
                int b = (grades[i]/10)*10;

                if(a - 5 > 2){
                    a = 10;                    
                }

                if(5 - a <= 2 && 5 - a > 0){
                    a = 5;                    
                }

                grades[i] = a + b;
            }            
        }
        return grades;
    }

}
