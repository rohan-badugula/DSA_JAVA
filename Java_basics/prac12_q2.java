// Write a program that reads a set of integers,and then prints the sum of the even and odd integers

import java.util.*;

public class prac12_q2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter: ");
        int siz = sc.nextInt();
        int even_sum = 0;
        int odd_sum = 0;
        System.out.println("Enter number one-by-one");
        for(int i = 0; i < siz; i++){
            int num = sc.nextInt();
            if(num % 2 == 0){
                even_sum = even_sum + num;
            }
            else{
                odd_sum = odd_sum + num;
            }
        }
        System.out.println("Sum of Even numbers: " + even_sum);
        System.out.println("Sum of Odd numbers:  " + odd_sum);
    }
}