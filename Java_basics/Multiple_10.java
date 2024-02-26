import java.util.Scanner;
public class Multiple_10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            int num = sc.nextInt();
            if (num % 10 == 0){
                System.out.println(num + " is a multiple of 10");
                break;
            }
        }
    }
}