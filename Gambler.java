import java.util.Random;

public class gambler {
	//Variable declarations
    int stake=100;
    int bet=1;
    int unLuckiestDayOfMonth=0;
    int LuckiestDayOfMonth=0;
    Random rand = new Random();

    public static void main(String args[]){
        gambler obj=new gambler();
        int daysToBePlayed=30; //Days to be Played in Gambling
        int dailyGamblingLimit=50;
        obj.findDaysWonLost(daysToBePlayed,dailyGamblingLimit);
    }

	//Method for Finding days won and lost in Month by how much
   public void findDaysWonLost(int daysToBePlayed,int dailyGamblingLimit){
		int maxWinningAmmount=0;
      int maxLoosingAmmount=0;
      for(int i=1;i<=daysToBePlayed;i++){

			//Putting bet using Random()
      	boolean bettingInCasino = rand.nextBoolean();
         if(bettingInCasino==true){
				//For calculating specific day's win
	         for(int j=0;j<rand.nextInt(dailyGamblingLimit);j++) {
	            stake += bet;
                }
						//Temp variable will be used for finding difference between 
						//current cash and original stake value
                int temp=stake-100;
                System.out.println("Day "+i+ " winning is "+(temp));

			//if current cash in temp is higher which means it's winning
         if(temp>=maxWinningAmmount) {
         	maxWinningAmmount=temp;
            LuckiestDayOfMonth=i;
			}
			stake=100;

			//bettingInCasino==false
			}else{

					//For calculating specific day's loose
			for(int j=0;j<rand.nextInt(dailyGamblingLimit);j++) {
				stake -= bet;
			}
         int temp=100-stake;
         System.out.println("Day "+i+ " loosing is "+(temp));
			//if current cash in temp is lower which means it's loosing
          if(temp>=maxLoosingAmmount){
          	maxLoosingAmmount=temp;
            unLuckiestDayOfMonth=i;
           }
           stake=100;
			}
		}
		System.out.println("You have lost "+maxLoosingAmmount+ " on Day" +unLuckiestDayOfMonth);
      System.out.println(" You have Won  "+maxWinningAmmount+ " on Day "+LuckiestDayOfMonth);
    }
}


