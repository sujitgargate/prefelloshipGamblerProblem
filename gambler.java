import java.util.Scanner;

public class gambler {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nChoose option 1 if You would like to continue playing next month  \n choose option 2 if you wish to stop playing");
        int ch=sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("See You Next Month..");
                break;
            case 2:
                System.out.println(" Bye Bye ,Come Again...!");
        }
    }
}


