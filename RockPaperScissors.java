import java.util.Scanner;
import java.lang.Math;
public class RockPaperScissors {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Lets play Rock paper scissors (rock-0,paper-1,scissors-2)");
        int playerimput = scan.nextInt();
        int computer = (int)(Math.random()*3);
        System.out.println("computer plays: "+computer);
        if(playerimput==computer){
            System.out.println("Tie! please play again");
        }
        else if(playerimput==0&&computer==2){
            System.out.println("rock beats scissors!! You win!!");
        }
        else if(playerimput==2&&computer==0){
            System.out.println("rock beats scissors!! You lose :(");
        }
        else if(playerimput==0&&computer==1){
            System.out.println("paper covers rock!! you lose :(");
        }
        else if(playerimput==1&&computer==0){
            System.out.println("paper covers rock!! you win!! :(");
        }
        else if(playerimput==1&&computer==2){
            System.out.println("scissors cuts paper!! you lose :(");
        }
        else if(playerimput==2&&computer==1){
            System.out.println("scissors cuts paper!! you win!! :(");
        }
    }
}


