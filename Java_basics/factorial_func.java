import java.util.Scanner;
public class factorial_func{
    public static int fac(int num){
        int p = 1;
        for(int i = 1; i <= num ; i++){
            p = p * i;
        }
        return p;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = fac(num);
        System.out.println("Factorial is: "+ factorial);
    }
}