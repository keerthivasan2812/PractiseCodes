package round2.org;

public class CricketScore {
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		String scorecard="1 . 2 . 4 3 6 W 1 . N . 2 1";
		
		countscores(scorecard);
		
		
	}
	
	public static void countscores(String score) {
		
		
		if(score.trim().isEmpty()) {
			
			System.out.println("please enter a the score to proceed");
			
		}
		
		int player=1;
		
		
		String[] separate=score.split(" ");
		
		int extras=0;
		int player1=0;
		int player2=0;
		
		for(String part:separate) {
			
		
		
		if(part.equals("W")||part.equals("N")) {
			
			extras++;
			
			
		}else if(!part.equals(".")) {
			int runs = Integer.parseInt(part);
			
			boolean retainstrike=false;
			
			if(player==1) {
				
			 player1+=runs;
			 
			 if(runs % 2 != 0) {
				
			player=2;	
			 }
				
			}else {
				 player2+=runs;
				
				
				 if(runs % 2 != 0) {
						
						player=1;	
						 }
				 
			}
			
			
			
			
			
		}
		
		
		
		}
		System.out.println("player1 "+player1);
		System.out.println("player2 "+player2);
		System.out.println("extras "+extras);
		
		
		
		
		
	}

}
