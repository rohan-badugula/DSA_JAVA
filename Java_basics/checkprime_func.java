import java.util.*;
public class checkprime_func{
    public static boolean isPrime(int num){
        boolean ip = true;
        if(num == 1){
            System.out.println("1 is neither prime nor composite");
            ip = false;
        }
        for(int i = 2; i<= Math.sqrt(num); i++){
            if(num%i == 0){
                ip = false;
                return ip;
            }
        }
        return ip;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if( isPrime(num)){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is Not prime");
        }
    }
}