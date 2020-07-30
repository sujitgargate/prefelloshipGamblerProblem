public class uc3{

        public static int winLoose(){
                int bet=1;
                int stake=100;
                if(stake!=150 || stake!=50){
                        int betting=(int)(Math.floor(Math.random()*10)%2);
                        if(betting==1){
                                stake+=50;
                        }else{
                                stake-=50;
			}
                }
                if(stake==150){
                        System.out.println("You won the game..You are done for today..!! Thank You..");
                }else{
                        System.out.println("You lost the game..You are done for today..!! please try again tomorrow..");
		}
                return stake;
        }
        public static void main(String args[]){
                int result=winLoose();
                System.out.println(result);
        }


}
