import java.util.*;
public class NumberGuess {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;
        int rounds = 0;
        System.out.println("Guess the number between 1 to 100");
        while(true){
        int x = rand.nextInt(101);
        int g;
        int i=1;
        for(i=1;i<=10;i++){
            System.out.print("Enter your guess : ");
            g = sn.nextInt();
            if(g==x){
                System.out.println("You have guessed it correct");
                score+=1;
                rounds+=1;
                break;
            }
            if(x<g){
                System.out.println("You are too high");
            }
            else if (x>g){
                System.out.println("You are too low");
            }
        }
        if(i>10){
            System.out.println("Better luck next time. The number is "+x);
            rounds+=1;
        }
        System.out.print("Do you want to play again ? (y/n) : ");
        char ans = sn.next().charAt(0);
        if(ans=='n'){
            System.out.println("Number of rounds : "+rounds);
            System.out.print("Your score is    : "+score);
            break;
        }
    }
    }
}
