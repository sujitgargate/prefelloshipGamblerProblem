import java.util.Random;
public class gambler{
   //Global variables declared
   public static int bet = 1;
   public static int stake = 100;

	public static void main(String args[]){
		System.out.println("New Day Stake is "+startingNewDay());

   	int resultOfWinLoose = winLooseGame();
      System.out.println(resultOfWinLoose);
      }

	//Method for finding winLooseGame
	public static int winLooseGame(){
	Random rand = new Random();

	//Checking Whethwer stake value should not go above 150 or below 50
   while(stake<=150 && stake >=50) {

		//Random is used for generating boolean values
   	boolean betting = rand.nextBoolean();
      if (betting == true) {
      stake += bet;
      }else {
      	stake -= bet;
      }
	}
	//If stake reaches to 150 then He is winner for day and he can only Play on next day
   if(stake == 150){
   	System.out.println("You won the game..You are done for today..!! Thank You.. please try again tomorrow..");
   }else{
   	System.out.println("You lost the game..You are done for today..!! please try again tomorrow..");
	}
	return stake;
	}

   public static int startingNewDay(){
      int stake=100;
		return stake;
   }
}
