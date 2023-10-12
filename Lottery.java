
import java.util.Scanner;
import java.lang.Math;
public class Lottery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 single digit numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int num1 = (int)(Math.random()*10+0);
        int num2 = (int)(Math.random()*10+0);
        System.out.println("lotto number: "+num1 + num2);
        if(a==num1&&b==num2){
            System.out.println("YOU WON THE LOTTERY!!");
        }
        else if(a==num2&&b==num1){
            System.out.println("you won $2000");
        }
        else if(a==num1&&b!=num2){
            System.out.println("you won $500");
        }
        else if(a!=num1&&b==num2){
            System.out.println("you won $500");
        }
        else{
            System.out.println("Too bad maybe next time");
        }




    }
}

