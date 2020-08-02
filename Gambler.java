import java.util.Random;
import java.util.Scanner;

public class Gambler {

    //Variables and Constants
    int stake = 100;
    int bet = 1;
    int unLuckiestDayOfMonth = 0;
    int LuckiestDayOfMonth = 0;
    int daysToBePlayed = 30;
    int dailyGamblingLimit = 50;

    Random rand = new Random();

    public static void main(String args[]) {

      Gambler obj = new Gambler();
      Scanner sc = new Scanner(System.in);

      //Switch case for Player's choice If he wants to continue play next month or stop playing.
      System.out.println("Enter Your Choice \n1.Continue Play Next Month \n2.Stop Playing");

      //Asking Player to enter Choice
      byte playerChoiceForPlay = sc.nextByte();

      switch(playerChoiceForPlay){
         case 1:
            obj.startingNewMonth();
         break;

         case 2:
            System.exit(0);
         break;

         default:
            System.out.println("Invalid Option choosen");
      }
    }

    //findDaysWonLost() Method Finds The Max Wining and Loosing Amount Days Wise
    public void findDaysWonLost(int daysToBePlayed, int dailyGamblingLimit) {
        //variables for winnig mount and loosing amount
        int maxWinningAmmount = 0;
        int maxLoosingAmmount = 0;

        //For loop will continue to execute until defined maximum days to be played, here it is 30 days.
        for (int i = 1; i <= daysToBePlayed; i++) {
            boolean bettingInCasino = rand.nextBoolean();

            if (bettingInCasino == true) {

                /*if player wins, Ramdom() will generate winning ammount and it will stop if it exceeds daily winning
                amount.
                */
                for (int j = 0; j < rand.nextInt(dailyGamblingLimit); j++) {
                    stake += bet;
                }

                //temp will store the amount won other than the original amount.
                int temp = stake - 100;
                System.out.println("Day " + i + " winning is " + (temp));

                //Here we are comparing maxWinningAmmount with temp for max winnig amount.
                if (temp >= maxWinningAmmount) {
                    maxWinningAmmount = temp;
                    LuckiestDayOfMonth = i;
                }

                //Here new day starts and stake will be again 100.
                stake = 100;

              //else is for loosing amount.
            } else {
                for (int j = 0; j < rand.nextInt(dailyGamblingLimit); j++) {
                    stake -= bet;
                }

                int temp = 100 - stake;
                System.out.println("Day " + i + " loosing is " + (temp));

                if (temp >= maxLoosingAmmount) {
                    maxLoosingAmmount = temp;
                    unLuckiestDayOfMonth = i;
                }
                //Here new day starts
                stake = 100;
            }
        }

        System.out.println("You have lost " + maxLoosingAmmount + " on Day" + unLuckiestDayOfMonth);
        System.out.println("You have Won  " + maxWinningAmmount + " on Day " + LuckiestDayOfMonth);
    }

   //Starting new month if player wants to play
   public void startingNewMonth(){

      //Player will again starts playing by calling this method.
      findDaysWonLost(daysToBePlayed, dailyGamblingLimit);
   }
}



