package hackerrank.solution;
import java.util.Scanner;



public class MyTestClass {
	
	private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String target = "";

        int loops = input.nextInt();

        input.nextLine();

        while(loops > 0){
            target = input.nextLine();
            printString(target);

            loops--;
        }
    }

    private static void printString(String str){
        String odd = "";
        String even = "";

        for(int i = 0; i < str.length(); i++){
            if(i%2 == 0){
                even += str.charAt(i);
            }else{
                odd += str.charAt(i);
            }
        }

        System.out.println(even + " " + odd);
    }

}
