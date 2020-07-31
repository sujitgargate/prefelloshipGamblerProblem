import java.util.Random;
public class gambler{
	
	//Constants declared
	public static int daysToBeCalculated=20; //Total Days to Be calculated
	public static int stake=100;
	public static int bet=1;
	public static int wonCounter=0; 
	public static int looseCounter=0;

	public static void main(String args[]){
		//Method calling
		calculateTotalWinLoose(daysToBeCalculated);
	}

	public static void calculateTotalWinLoose(int daysToBeCalculated){
		for(int i=0;i<daysToBeCalculated;i++){
			findWinLoose();
		}
	}

	//This method will Print the Number of wins or looses
	public static void findWinLoose(){

		Random rand = new Random();
		//For Finding Winning or loosing using Random() function
		boolean bettingInCasino = rand.nextBoolean();
		if(bettingInCasino==true){
			wonCounter++;
			System.out.println("Winning "+wonCounter);
		}else{
			looseCounter--;
			System.out.println("Loosing "+looseCounter);
		}
	}
}

