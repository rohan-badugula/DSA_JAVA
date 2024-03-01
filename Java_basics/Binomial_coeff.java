import java.util.Scanner;
public class Binomial_coeff{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(" n  C  r : ");
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        System.out.println("Enter the value of r ");
        int r = sc.nextInt();
        int bc = factorial_func.fac(n)/(factorial_func.fac(r) * factorial_func.fac(n-r));
        System.out.println("Binomial Coeff: "+ bc);
    }
}