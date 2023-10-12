import java.util.Scanner;
public class IPAdress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter 4 whole numbers ");
        int octet1 = scan.nextInt();
        int octet2 = scan.nextInt();
        int octet3 = scan.nextInt();
        int octet4 = scan.nextInt();
        boolean correct = true;
        if(octet1<0 || octet1>255){
            System.out.println("Octet 1 is incorrect");
            correct = false;
        }
        if(octet2<0 || octet2>255) {
            System.out.println("Octet 2 is incorrect");
            correct = false;
        }
        if(octet3<0 || octet3>255) {
            System.out.println("Octet 3 is incorrect");
            correct = false;
        }
        if(octet4<0 || octet4>255) {
            System.out.println("Octet 4 is incorrect");
            correct = false;
        }
        if(correct){
            System.out.println("Your IP Adress is : "+octet1+"."+octet2+"."+octet3+"."+octet4);
        }

    }
}