import java.util.Random;
public class gambler{
	int bet=1;
	int stake=100;
	Random rand = new Random();

	public static void main(String args[]){
		gambler obj=new gambler();
		int winLooseResult=obj.winLooseBetting();
		System.out.println(winLooseResult);
	}

	public int winLooseBetting(){
		boolean bettingInCasino = rand.nextBoolean();
		if(bettingInCasino==true){
			stake+=bet;
		}else{
			stake-=bet;
		}
		return stake;
	}
}



