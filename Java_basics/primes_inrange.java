import java.util.*;
public class primes_inrange{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start point of range: ");
        int low= sc.nextInt();
        System.out.println("Enter the end point of range: ");
        int high= sc.nextInt();
        System.out.println("The primes in given range are : ");
        for(int i = low; i<= high; i++){
            if(checkprime_func.isPrime(i)){
                System.out.print(" "+ i+ " ");
            }
        }
    }
}