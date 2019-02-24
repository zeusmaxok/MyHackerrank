package learning;

import java.util.*;


public class SortByMultipleField {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        // Arrays.sort(player, checker);
        Arrays.sort(player, new Comparator<Player>() {

			@Override
			public int compare(Player a, Player b) {
				 int nameCompare = a.name.compareTo(b.name);
			        int scoreCompare = b.score - a.score;

			        if(scoreCompare == 0){
			            return (nameCompare == 0) ? scoreCompare : nameCompare;
			        }else{
			            return scoreCompare;
			        }
			}
        	
        });
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}


class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

class Checker implements Comparator<Player> {
  	// complete this method
    @Override
	public int compare(Player a, Player b) {
    	 int nameCompare = a.name.compareTo(b.name);
         int scoreCompare = b.score - a.score;

         if(scoreCompare == 0){
             return (nameCompare == 0) ? scoreCompare : nameCompare;
         }else{
             return scoreCompare;
         }
       
    }
}
