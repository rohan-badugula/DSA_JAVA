import java.util.Scanner;

public class Reversing_number{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int rev = 0;
        int i = 0;
        while(num != 0){
            i = num % 10;
            rev = rev*10+i;
            num = num / 10;
        }
        System.out.println("The reverse is:" + rev);
    }
}