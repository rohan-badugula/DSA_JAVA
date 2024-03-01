// Write a Java method to compute the sum of the digits in an integer.

import java.util.Scanner;
public class prac14_q5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;
        int sum = 0;
        while(num != 0){
            i = num %10;
            sum = sum + i;
            num = num /10;
        }
        System.out.println("The Sum of digits is: "+ sum);
    }
}