import java.util.*;

public class prime_check{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num = sc.nextInt();
        boolean flag = true;
        for(int i =2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                System.out.println(num+ " is not prime");
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println(num+ " is prime");
        }

    }
}