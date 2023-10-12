import java.util.Scanner;
public class GradeOutput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your number grade in integer form");
        int grade = scan.nextInt();
        if (grade <= 100 && grade >= 98) {
            System.out.println("A+");
        } else if (grade <= 97 && grade >= 93) {
            System.out.println("A");
        } else if (grade <= 92 && grade >= 90) {
            System.out.println("A-");
        } else if (grade <= 89 && grade >= 88) {
            System.out.println("B+");
        }
        else if(grade<=87&&grade>=83) {
            System.out.println("B");
        }
        else if(grade<=82&&grade>=80) {
            System.out.println("B-");
        }
        else if(grade<=79&&grade>=78) {
            System.out.println("C+");
        }
        else if(grade<=77&&grade>=73) {
            System.out.println("C");
        }
        else if(grade<=72&&grade>=70) {
            System.out.println("C-");
        }
        else if(grade<=69&&grade>=68) {
            System.out.println("D+");
        }
        else if(grade<=67&&grade>=63) {
            System.out.println("D");
        }
        else if(grade<=62&&grade>=60) {
            System.out.println("D-");
        }
        else if(grade<=59&&grade>=0) {
            System.out.println("F");
        }


    }
}
