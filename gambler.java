import java.util.Random;

public class gambler {
    int stake=100;
    int bet=1;
    Random rand = new Random();

    public static void main(String args[]){
        gambler obj=new gambler();
        int daysToBeCalculated=30;
        int dailyLimit=50; //Daily Limit For Winning/Loosing in Dollars
        obj.findDaysWonLost(daysToBeCalculated,dailyLimit);
    }

	//Method for Finding Days Won and lost In dollars

	public void findDaysWonLost(int days,int dailyLimit){
		for(int i=1;i<=days;i++){
      	boolean bettingInCasino = rand.nextBoolean();
         if(bettingInCasino==true){
				//If won , Loop for Winning
         	for(int j=0;j<rand.nextInt(dailyLimit);j++) {
            	stake += bet;
            }
            System.out.println("Day "+i+ " winning is "+(stake-100));
            stake = 100;
				//If lost, Loop for Loosing
            }else{
            	for(int j=0;j<rand.nextInt(dailyLimit);j++) {
                    stake -= bet;
                }
            System.out.println("Day "+i+ " loosing is "+(100-stake));
            stake = 100;
            }
        }
    }
}
