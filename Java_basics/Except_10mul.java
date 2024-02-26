import java.util.Scanner;

public class Except_10mul{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            int num = sc.nextInt();
            if (num % 10 == 0){
                continue;
            }
            System.out.println(num + " is your number");
        }
    }
}