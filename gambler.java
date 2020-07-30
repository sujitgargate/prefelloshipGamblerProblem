public class uc2{

	public static int winLoose(){
		int bet=1;
		int stake=100;
			int betting=(int)(Math.floor(Math.random()*10)%2);
			if(betting==1){
				stake++;
			}
				stake--;
		
		return stake;
	}
	public static void main(String args[]){
		int result=winLoose();
		System.out.println(result);
	}


}
