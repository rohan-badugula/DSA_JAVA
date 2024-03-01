// Write a method named is Even that accepts an int argument.
// The method should return true if the argument iseven,or false otherwise.
// Also write a program to test your method.
import java.util.Scanner;

public class prac14_q2{
    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean res = isEven(num);
        System.out.println(res);
    }
}